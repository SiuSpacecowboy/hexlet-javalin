package main_project.dao;

import main_project.dto.User;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDao {

    private static long ID;
    //private List<User> users = new ArrayList<>();
    private List<User> users = List.of(
            new User(1L,"A", "B", "email", "as"),
            new User(2L,"A", "B", "email", "as"),
            new User(3L,"A", "B", "email", "as"),
            new User(4L,"A", "B", "email", "as"),
            new User(5L,"A", "B", "email", "as"),
            new User(6L,"A", "B", "email", "as")
    );

    public Long save(User user) {
        user.setId(++ID);
        users.add(user);
        return ID;
    }

    public List<User> getUsers() {
        return users;
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

    public void editUser(User user, Long id) {
        User startUser = findUserById(id);
        startUser.setFirstName(user.getFirstName());
        startUser.setLastName(user.getLastName());
        startUser.setEmail(user.getEmail());
        startUser.setPassword(user.getPassword());
    }

    public void deleteUser(Long id) {
        users.remove(findUserById(id));
    }

    public void clear() {
        users.clear();
    }
}
