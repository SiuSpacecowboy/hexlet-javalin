package exercise.lesson16;

import exercise.lesson16.dto.UserEditPageWithErrors;
import io.javalin.http.Context;
import io.javalin.validation.ValidationException;
import main_project.controllers.MainController;
import main_project.dao.UserDao;
import main_project.dto.User;
import main_project.helpfulClasses.Capital;
import main_project.util.NameRoutes;

import java.util.Collections;

public class TenthApp {

    public static final UserDao userDao = MainController.getUserDao();

    public static void editUser(Context ctx) {
        Long id = ctx.pathParamAsClass("id", Long.class).get();
        User user = userDao.findUserById(id);
        UserEditPageWithErrors errors =
                new UserEditPageWithErrors(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
        ctx.render("lesson16/edit.jte", Collections.singletonMap("errors", errors));
    }

    public static void postEditUser(Context ctx) {
        Long id = ctx.pathParamAsClass("id", Long.class).get();
        String firstName = ctx.formParam("firstname").toLowerCase();
        firstName = Capital.capitalNames(firstName);
        String lastName = ctx.formParam("lastname").toLowerCase();
        lastName = Capital.capitalNames(lastName);
        String email = ctx.formParam("email").toLowerCase().trim();
        String confirmPassword = ctx.formParam("confirm");
        String password = ctx.formParam("password");
        try {
            ctx.formParamAsClass("password", String.class)
                    .check(v -> v.equals(confirmPassword), "Password must be same")
                    .get();
            ctx.formParamAsClass("firstname", String.class)
                    .check(v -> v.length() > 1, "Is too short name")
                    .get();
            ctx.formParamAsClass("lastname", String.class)
                    .check(v -> v.length() > 1, "Is too short surname")
                    .get();
            ctx.formParamAsClass("email", String.class)
                    .check(v -> v.contains("."), "Wrong style email")
                    .get();
            User user = new User(id, firstName, lastName, email, password);
            userDao.editUser(user, id);
            ctx.redirect(NameRoutes.oneUserPath(String.valueOf(id)));
        } catch (ValidationException e) {
            UserEditPageWithErrors errors = new UserEditPageWithErrors(id, firstName, lastName, email, password, e.getErrors());
            ctx.status(422);
            ctx.render("lesson16/edit.jte", Collections.singletonMap("errors", errors));
        }
    }
}
