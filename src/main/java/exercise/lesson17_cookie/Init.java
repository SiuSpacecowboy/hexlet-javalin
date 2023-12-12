package exercise.lesson17_cookie;

import exercise.lesson15_crud.PagesController;
import exercise.lesson16_mvc.EditUserController;
import io.javalin.Javalin;
import main_project.controllers.MainController;
import main_project.util.NameRoutes;

public class Init {

    public static void main(String[] args) {
        Javalin app = Javalin.create(config ->
                config.plugins.enableDevLogging());
        app.get(NameRoutes.startPath(), MainController::start);
        app.get(NameRoutes.allUsersPath(), PagesController::pages);
        app.get(NameRoutes.buildUserPath(), MainController::buildUser);
        app.get(NameRoutes.oneUserPath("{id}"), PostNewUserController::getNewOneUser);
        app.get(NameRoutes.editUserPath("{id}"), EditUserController::editUser);
        app.post(NameRoutes.oneUserPath("{id}"), EditUserController::postEditUser);
        app.post(NameRoutes.allUsersPath(), PostNewUserController::postNewBuildUser);
        app.start(8080);
    }
}
