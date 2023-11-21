package exercise.lesson7l8;

import io.javalin.Javalin;
import org.eclipse.jetty.http.HttpStatus;

import java.util.Collections;
import java.util.List;

public class FifthApp {

    List<User> list = List.of(
            new User("Aban", 1),
            new User("Banam", 2),
            new User("Canam", 3),
            new User("Danam", 4),
            new User("Eban", 5),
            new User("Fanam", 6)
            );

    public Javalin getApp() {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        app.get("users", ctx -> {
            UsersPage users = new UsersPage(list);
            ctx.render("lesson7_8/users/index.jte", Collections.singletonMap("users", users));
        });
        app.get("users/{id}", ctx -> {
            int id = ctx.pathParamAsClass("id", Integer.class).get();
            System.out.println(id);
            if (list.size() < id) {
                System.out.println(list.size());
                ctx.status(HttpStatus.NOT_FOUND_404);
                ctx.result("Not Found");
            } else {
                System.out.println(list.size());
                UserPage user = new UserPage(list.get(id - 1));
                ctx.render("lesson7_8/users/show.jte", Collections.singletonMap("user", user));
            }
        });
        app.get("/", ctx -> ctx.render("lesson7_8/start-page.jte"));
        return app;
    }
}
