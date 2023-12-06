package exercise.lesson15_crud;

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
        app.get(NameRoutes.oneUserPath("{id}"), MainController::getOneUser);
        app.post(NameRoutes.allUsersPath(), MainController::postBuildUser);
        app.start(8080);
    }
}
