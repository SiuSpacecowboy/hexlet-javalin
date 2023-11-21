package exercise.lesson15;

import io.javalin.http.Context;
import main_project.controllers.MainController;
import main_project.dao.UserDao;
import main_project.dto.User;

import java.util.Collections;
import java.util.List;

public class NinthApp {

    private static final UserDao userDao = MainController.getUserDao();

    public static void pages(Context ctx) {
        var page = ctx.queryParamAsClass("page", Long.class)
                .getOrDefault(1L);
        long supPage = 1L;
        if (page > 1) {
            supPage = page;
        }
        long firstUser = (supPage - 1) * 5;
        long lastUser = supPage * 5;
        boolean haveUsers = !userDao.getUsers().isEmpty();
        List<User> res = userDao.getUsers().stream()
                .skip(firstUser)
                //.limit(lastUser + 1)
                .limit(lastUser)
                .toList();
        exercise.lesson15.UsersPage users = new UsersPage(res, page, haveUsers);
        ctx.render("lesson15/users-list.jte", Collections.singletonMap("users", users));
    }
}
