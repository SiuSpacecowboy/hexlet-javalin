package exercise.lesson5;

import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.List;

public class ThApp {

    private static List<String> list = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14",
            "15", "16", "17", "18", "19", "20", "21");

    public Javalin getApp() {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        app.get("/users", ctx -> {
            int numOfPage = ctx.queryParamAsClass("page", Integer.class).getOrDefault(1);
            int per = ctx.queryParamAsClass("per", Integer.class).getOrDefault(5);
            int indOfLastEl = numOfPage * per;
            List<String> fin = new ArrayList<>();
            for (int i = indOfLastEl - per; i < indOfLastEl; i++) {
                fin.add(list.get(i));
            }
            ctx.json(fin);
        });
        return app;
    }
}
