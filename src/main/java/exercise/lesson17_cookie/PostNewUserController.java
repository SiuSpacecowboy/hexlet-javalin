package exercise.lesson17_cookie;

import io.javalin.http.Context;
import io.javalin.validation.ValidationException;
import main_project.controllers.MainController;
import main_project.dao.UserDao;
import main_project.dao.UserDaoNoDB;
import main_project.dto.User;
import main_project.dto.UserPage;
import main_project.dto.UserPageWithErrors;
import main_project.helpfulClasses.Capital;
import main_project.helpfulClasses.Sesuritu;
import main_project.util.NameRoutes;

import java.util.Collections;

public class PostNewUserController {

    public static final UserDao userDao = MainController.getUserDao();

/*    public static void buildNewUser(Context ctx) {
        *//*String token = Sesuritu.generateToken();*//*
        UserPageWithErrors errors = new UserPageWithErrors();
        ctx.render("main_project/users/new-user.jte", Collections.singletonMap("errors", errors));
        *//*ctx.cookie("token", token);*//*
    }*/


    public static void postNewBuildUser(Context ctx) {
        String firstName = ctx.formParam("firstname").toLowerCase();
        firstName = Capital.capitalNames(firstName);
        String lastName = ctx.formParam("lastname").toLowerCase();
        lastName = Capital.capitalNames(lastName);
        String email = ctx.formParam("email").toLowerCase().trim();
        String confirmPassword = ctx.formParam("confirm");
        try {
            String password = ctx.formParamAsClass("password", String.class)
                    .check(v -> v.equals(confirmPassword), "Passwords must be the same.")
                    .get();
            password = Sesuritu.encrypt(password); // Для ArrayList.
            String token = Sesuritu.generateToken();
            User user = new User(firstName, lastName, email, password, token);
            userDao.save(user);
            ctx.sessionAttribute("flash","Without further interruption, lets celebrate and suck some dicks");
            ctx.cookie("token", token);
            ctx.redirect(NameRoutes.allUsersPath());
        } catch (ValidationException e) {
            UserPageWithErrors errors = new UserPageWithErrors(firstName, lastName, email, e.getErrors());
            ctx.sessionAttribute("flash","Fucking slave, get your ass back here");
            errors.setFlash(ctx.consumeSessionAttribute("flash"));
            ctx.status(422);
            ctx.render("main_project/users/new-user.jte", Collections.singletonMap("errors", errors));
        }
    }

    public static void getNewOneUser(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        User tryUser = userDao.findUserById(id);
        if (tryUser != null && tryUser.getToken().equals(ctx.cookie("token"))) {
            UserPage page = new UserPage(tryUser);
            page.setFlash(ctx.consumeSessionAttribute("flash"));
            ctx.render("main_project/users/user.jte", Collections.singletonMap("page", page));
        } else if (tryUser == null) {
            ctx.status(404);
            ctx.render("main_project/not-found.jte");
        } else if (!tryUser.getToken().equals(ctx.cookie("token"))) {
            ctx.render("lesson17/bad-token.jte");
        }
    }
}


