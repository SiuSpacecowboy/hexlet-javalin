package exercise.lesson12.dao;

import exercise.lesson10.Person;
import exercise.lesson12.dto.User;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static long ID;
    private List<User> users = new ArrayList<>();

    public void save(User user) {
        user.setId(++ID);
        users.add(user);
    }

    public List<User> findByTerm(String term) {
        return users.stream()
                .filter(v -> StringUtils.startsWithIgnoreCase(v.getFirstName(), term))
                .toList();
    }

    public User findUserById(Long id) {
        return users.stream()
                .filter(v -> v.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void deleteUser(Long id) {
        users.remove(findUserById(id));
    }

    public List<User> getUsers() {
        return users;
    }

    public void clear() {
        users.clear();
    }
}
