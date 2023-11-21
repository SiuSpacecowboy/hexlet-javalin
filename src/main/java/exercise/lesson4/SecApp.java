package exercise.lesson4;

import io.javalin.Javalin;

import java.util.List;

public class SecApp {

    public Data data;

    public SecApp(Data data) {
        this.data = data;
    }

/*    public String converterJson() {

    }*/
    public Javalin getApp() {
        List<String> phones = data.phones();
        List<String> domains = data.domains();
        Javalin app =  Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        app.get("/phones", ctx -> ctx.json(phones));
        app.get("/domains", ctx -> ctx.json(domains));
        return app;
    }

    public static void main(String[] args) {
        List<String> ph = List.of("123", "456", "789");
        List<String> dm = List.of("first", "second", "third");
        Data data = new Data(ph, dm);
        SecApp r = new SecApp(data);
        Javalin res = r.getApp();
    }
}
