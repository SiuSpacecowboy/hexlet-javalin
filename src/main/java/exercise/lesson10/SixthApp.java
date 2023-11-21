package exercise.lesson10;
import io.javalin.Javalin;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SixthApp {


    List<Person> list = List.of(
            new Person("Anna", "Rob"),
            new Person("Anna", "Robens"),
            new Person("Ansa", "wAts"),
            new Person("Anny", "Dworf"),
            new Person("Ben", "Rob"),
            new Person("Bar", "Robert"),
            new Person("Mark", "Rob"),
            new Person("Afa", "Rob")
            );

    public Javalin getApp() {
        var app = Javalin.create(config ->
                config.plugins.enableDevLogging());
        app.get("/users", ctx -> {
           String name = ctx.queryParam("term");
           List<Person> res = list.stream()
                   //.map(Person::name)
                   .filter(v -> StringUtils.startsWithIgnoreCase(v.name(), name))
                   .toList();
           var persons = new PersonsPage(res, name);
           ctx.render("lesson10/search.jte", Collections.singletonMap("persons", persons));
        });
        return app;
    }
}
