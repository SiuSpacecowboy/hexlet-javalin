package exercise.lesson4;

import io.javalin.Javalin;

import java.util.List;

public class Init {

    public static void main(String[] args) {
        List<String> ph = List.of("123", "456", "789");
        List<String> dm = List.of("first", "second", "third");
        Data data = new Data(ph, dm);
        SecApp app = new SecApp(data);
        Javalin init = app.getApp();
        init.start(8080);

    }
}
