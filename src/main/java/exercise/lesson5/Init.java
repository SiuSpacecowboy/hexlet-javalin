package exercise.lesson5;

import io.javalin.Javalin;

public class Init {

    public static void main(String[] args) {
        ThApp app = new ThApp();
        Javalin init = app.getApp();
        init.start(8080);
    }
}
