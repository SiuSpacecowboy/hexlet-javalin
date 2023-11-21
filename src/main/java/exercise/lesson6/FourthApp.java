package exercise.lesson6;

import io.javalin.Javalin;
import org.eclipse.jetty.http.HttpStatus;

import java.util.Map;

public class FourthApp {


    Map<String, String> company = Map.of(
            "id", "1",
            "name", "Google",
            "telephone", "12345678"
    );

    public Javalin getApp() {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        app.get("companies/{id}",
                ctx -> {
            var id = ctx.pathParam("id");
            if (company.get("id").equals(id)) {
                ctx.json(company);
            } else {
                ctx.status(HttpStatus.NOT_FOUND_404);
                ctx.result("Not Found");
            }
                });
        return app;
    }
}
