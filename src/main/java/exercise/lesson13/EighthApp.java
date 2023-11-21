package exercise.lesson13;

import exercise.lesson13.dto.Article;
import exercise.lesson13.dto.NewArticlePage;
import exercise.lesson13.dto.NewArticlePageWithErrors;
import io.javalin.Javalin;
import io.javalin.validation.ValidationError;
import io.javalin.validation.ValidationException;

import java.util.*;

public class EighthApp {

    private static Map<String, Article> map = new HashMap<>();

    public Javalin getApp() {
        var app = Javalin.create(config ->
                config.plugins.enableDevLogging());
        app.get("/", ctx -> {
            ctx.render("lesson13/start.jte");
        });
        app.get("articles/new", ctx -> {
            NewArticlePageWithErrors errors = new NewArticlePageWithErrors();
            ctx.render("lesson13/new-article.jte", Collections.singletonMap("errors", errors));
        });
        app.get("articles", ctx -> {
            NewArticlePage page = new NewArticlePage(map);
            ctx.render("lesson13/articles.jte", Collections.singletonMap("page", page));
                });
        app.post("articles", ctx -> {
            var text = ctx.formParamAsClass("text", String.class).get();
            String name = ctx.formParamAsClass("name", String.class).get();
            try {
                ctx.formParamAsClass("name", String.class)
                    .check(v -> v.length() >= 2, "Name must be longer")
                    .check(v -> !map.containsKey(v), "Must be Unique")
                    .get();
                ctx.formParamAsClass("text", String.class)
                    .check(v -> v.length() >= 10, " Is too short")
                    .get();
                map.put(name, new Article(name, text));
                ctx.redirect("articles");
            } catch (ValidationException e) {
                NewArticlePageWithErrors errors = new NewArticlePageWithErrors(name, text, e.getErrors());
                ctx.status(422);
                ctx.render("lesson13/new-article.jte", Collections.singletonMap("errors", errors));
        }
        });
        return app;
    }
}
