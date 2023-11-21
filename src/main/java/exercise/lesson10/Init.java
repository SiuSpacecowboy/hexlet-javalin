package exercise.lesson10;

import io.javalin.Javalin;

public class Init {

    public static void main(String[] args) {
        SixthApp app = new SixthApp();
        Javalin init = app.getApp();
        init.start(8080);
    }
}
