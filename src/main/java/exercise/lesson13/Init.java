package exercise.lesson13;

import exercise.lesson13.EighthApp;
import io.javalin.Javalin;

public class Init {

    public static void main(String[] args) {
        EighthApp app = new EighthApp();
        Javalin init = app.getApp();
        init.start(8080);
    }
}
