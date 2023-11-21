package main_project.util;

public class NameRoutes {

    public static String startPath() {
        return "/";
    }

    public static String allUsersPath() {
        return "/users";
    }

    public static String oneUserPath(String id) {
        return "/users/" + id;
    }

    public static String buildUserPath() {
        return "/users/build";
    }

    public static String editUserPath(String id) {
        return "/users/" + id + "/edit-user";
    }
}
