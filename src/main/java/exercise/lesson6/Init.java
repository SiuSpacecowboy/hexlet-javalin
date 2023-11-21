package exercise.lesson6;

import io.javalin.Javalin;

public class Init {

    public static void main(String[] args) {
        FourthApp app = new FourthApp();
        Javalin init = app.getApp();
        init.start(8080);
    }
}
