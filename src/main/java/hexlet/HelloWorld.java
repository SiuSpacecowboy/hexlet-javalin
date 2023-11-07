package hexlet;

import io.javalin.Javalin;

public class HelloWorld {

    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        // Описываем, что загрузится по адресу /
        app.get("/", ctx -> ctx.result("Hello World"));
        app.start(7071); // Стартуем веб-сервер
    }

}
