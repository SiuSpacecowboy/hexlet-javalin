package exercise.lesson3;

import io.javalin.Javalin;

public class App {

    public static Javalin getApp() {
        // BEGIN
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        app.get("/welcome", ctx -> ctx.result("Welcome to Hexlet!"));
        app.get("/hack/{id}",  ctx -> {
            var id = ctx.pathParam("id");
            ctx.contentType("html");
            ctx.result("<h1>" + id + "</h1>");
        });
        return app;
    }
    // END

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(8080);
    }
}
