package exercise.lesson7l8;

import io.javalin.Javalin;

public class init {

    public static void main(String[] args) {
        FifthApp app = new FifthApp();
        Javalin init = app.getApp();
        init.start(8080);
    }
}
