package exercise.lesson12;

import exercise.lesson12.dao.UserDao;
import exercise.lesson12.dto.User;
import exercise.lesson12.dto.UsersPage;
import exercise.lesson12.hepfulClasses.Capital;
import exercise.lesson12.hepfulClasses.Sesuritu;
import io.javalin.Javalin;

import java.util.Collections;

public class SeventhApp {

    private UserDao userDao = new UserDao();

    public Javalin getApp() {
        var app = Javalin.create(config ->
                config.plugins.enableDevLogging());
        app.get("users/build",
                ctx -> ctx.render("lesson12/build.jte"));
        app.get("/users", ctx -> {
            UsersPage page = new UsersPage(userDao.getUsers(), userDao.findUserById(1l));
            ctx.render("lesson12/show.jte", Collections.singletonMap("page", page));
        });
        app.post("users", ctx -> {
            String firstName = ctx.formParam("firstname").toLowerCase();
            firstName = Capital.capitalNames(firstName);
            String lastName = ctx.formParam("lastname").toLowerCase();
            lastName = Capital.capitalNames(lastName);
            String email = ctx.formParam("email").toLowerCase().trim();
            String password = ctx.formParam("password");
            password = Sesuritu.encrypt(password);
            System.out.println("==============================================================");
            User user = new User(firstName, lastName, email, password);
            userDao.save(user);
            ctx.redirect("/users");
        });
        return app;
    }
}
