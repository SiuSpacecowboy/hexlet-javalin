package exercise.lesson20_database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import exercise.lesson15_crud.PagesController;
import exercise.lesson16_mvc.EditUserController;
import exercise.lesson17_cookie.PostNewUserController;
import exercise.lesson18_sessions.SessionUserController;
import io.javalin.Javalin;
import main_project.controllers.MainController;
import main_project.util.NameRoutes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.SQLException;
import java.util.stream.Collectors;

public class Init {

    public static void main(String[] args) throws SQLException {
        var hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("jdbc:h2:mem:project;DB_CLOSE_DELAY=-1;");

        var dataSource = new HikariDataSource(hikariConfig);
        // Получаем путь до файла в src/main/resources
        var url = Init.class.getClassLoader().getResource("schema.sql");
        var file = new File(url.getFile());
        String sql = null;
        try {
            sql = Files.lines(file.toPath())
                    .collect(Collectors.joining("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Получаем соединение, создаем стейтмент и выполняем запрос
        try (var connection = dataSource.getConnection();
             var statement = connection.createStatement()) {
            statement.execute(sql);
        }
        BaseRepository.dataSource = dataSource;
        Javalin app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        app.get(NameRoutes.allUsersPath(), PagesController::pages);
        app.get(NameRoutes.buildUserPath(), MainController::buildUser);
        app.get(NameRoutes.oneUserPath("{id}"), PostNewUserController::getNewOneUser);
        app.get(NameRoutes.editUserPath("{id}"), EditUserController::editUser);
        app.post(NameRoutes.oneUserPath("{id}"), EditUserController::postEditUser);
        app.post(NameRoutes.allUsersPath(), PostNewUserController::postNewBuildUser);
        app.get(NameRoutes.startPath(), SessionUserController::startPage);
        app.get(NameRoutes.buildSessionsPath(), SessionUserController::sessionBuildUser);
        app.post(NameRoutes.sessionsPath(), SessionUserController::sessionCreateUser);
        app.post(NameRoutes.sessionsDeletePath(), SessionUserController::sessionDestroyUser);
        app.start(8080);
    }
}
