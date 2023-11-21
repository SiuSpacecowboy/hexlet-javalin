package exercise.lesson12;

import io.javalin.Javalin;

public class Init {

    public static void main(String[] args) {
        SeventhApp app = new SeventhApp();
        Javalin init = app.getApp();
        init.start(8080);
    }
}
