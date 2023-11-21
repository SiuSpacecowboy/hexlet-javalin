package main_project.controllers;

import io.javalin.http.Context;
import io.javalin.validation.ValidationException;
import main_project.dao.UserDao;
import main_project.dto.User;
import main_project.dto.UserPage;
import main_project.dto.UserPageWithErrors;
import main_project.dto.UsersPage;
import main_project.helpfulClasses.Capital;
import main_project.helpfulClasses.Sesuritu;
import main_project.util.NameRoutes;

import java.util.Collections;
import java.util.List;

public class MainController {

    private static final UserDao userDao = new UserDao();

    public static void start(Context ctx) {
        ctx.render("main_project/start-page.jte");
    }

    public static void getAllUsers(Context ctx) {
        List<User> list = userDao.getUsers();
        UsersPage users = new UsersPage(list);
        ctx.render("main_project/users/users-list.jte", Collections.singletonMap("users", users));
    }

    public static void getOneUser(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        User tryUser = userDao.findUserById(id);
        if (tryUser != null) {
            UserPage user = new UserPage(tryUser);
            ctx.render("main_project/users/user.jte", Collections.singletonMap("user", user));
        } else {
            ctx.status(404);
            ctx.redirect("main_project/not-found.jte");
        }
    }

    public static void buildUser(Context ctx) {
        UserPageWithErrors errors = new UserPageWithErrors();
        ctx.render("main_project/users/new-user.jte", Collections.singletonMap("errors", errors));
    }

    public static void postBuildUser(Context ctx) {
        String firstName = ctx.formParam("firstname").toLowerCase();
        firstName = Capital.capitalNames(firstName);
        String lastName = ctx.formParam("lastname").toLowerCase();
        lastName = Capital.capitalNames(lastName);
        String email = ctx.formParam("email").toLowerCase().trim();
        String confirmPassword = ctx.formParam("confirm");
        try {
            String password = ctx.formParamAsClass("password", String.class)
                    .check(v -> v.equals(confirmPassword), "Password must be same")
                    .get();
            password = Sesuritu.encrypt(password);
            User user = new User(firstName, lastName, email, password);
            Long id = userDao.save(user);
            ctx.redirect(NameRoutes.oneUserPath(String.valueOf(id)));
        } catch (ValidationException e) {
            UserPageWithErrors errors = new UserPageWithErrors(firstName, lastName, email, e.getErrors());
            ctx.status(422);
            ctx.render("main_project/users/new-user.jte", Collections.singletonMap("errors", errors));
        }
    }
    public static UserDao getUserDao() {
        return userDao;
    }

}
