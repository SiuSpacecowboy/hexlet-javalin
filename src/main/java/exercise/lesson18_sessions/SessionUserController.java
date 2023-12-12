package exercise.lesson18_sessions;

import io.javalin.http.Context;
import main_project.controllers.MainController;
import main_project.dao.UserDao;
import main_project.dao.UserDaoNoDB;
import main_project.dto.User;
import main_project.dto.UserPage;
import main_project.helpfulClasses.Sesuritu;

import java.util.Collections;

public class SessionUserController {

    private static final UserDao userDao = MainController.getUserDao();

    public static void startPage(Context ctx) {
        var page = new UserPage(ctx.sessionAttribute("user"));
        page.setFlash(ctx.consumeSessionAttribute("flash"));
        ctx.render("main_project/start-page.jte", Collections.singletonMap("page", page));
    }

    public static void sessionBuildUser(Context ctx) {
        User user = new User();
        ctx.render("lesson18/build.jte", Collections.singletonMap("user", user));
    }

    public static void sessionCreateUser(Context ctx) {
        var name = ctx.formParam("firstname");
        var password = ctx.formParam("password");
        String finalPassword = Sesuritu.encrypt(password); // Для ArrayList
        User res = userDao.getUsers().stream()
                .filter(v -> v.getFirstName().equals(name))
                .filter(v -> v.getPassword().equals(finalPassword) || v.getToken().equals(password)) // Для ArrayList
                //.filter(v -> v.getPassword().equals(password)) // Для List.of()
                .findFirst()
                .orElse(null);
        System.out.println(res);
        if (res == null) {
            User user = new User();
            user.setFirstName(name);
            ctx.sessionAttribute("flash", "FUCK YOU");
            user.setFlash(ctx.consumeSessionAttribute("flash"));
            ctx.render("lesson18/build.jte", Collections.singletonMap("user", user));
        } else {
            ctx.cookie("token", res.getToken());
            ctx.sessionAttribute("user", res); /** Можно добавлять в сессию value не только String, как это утверждается **/
            ctx.sessionAttribute("flash", "Oh, I'm fucking cumming");
            ctx.redirect("/");
        }
    }

    public static void sessionDestroyUser(Context ctx) {
        ctx.sessionAttribute("user", null);
        ctx.sessionAttribute("idk", null);
        ctx.redirect("/");
    }
}
