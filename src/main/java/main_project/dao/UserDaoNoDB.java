package main_project.dao;

import main_project.dto.User;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class UserDaoNoDB implements UserDao{

    private static long ID = 6;
    private List<User> users = new ArrayList<>();

    {
        users.add(new User(1L,"Vitaly", "Brew", "email@ramb.ru", "as", "wrasz"));
        users.add(new User(2L,"DimAss", "Brow", "email@mai.ru", "as", "mrasz"));
        users.add(new User(3L,"VlaDick", "Bruw", "email@gma.ru", "as", "crasz"));
        users.add(new User(4L,"YaroSlave", "Bryw", "email@res.ru", "as", "srasz"));
        users.add(new User(5L,"SerGay", "Braw", "email@mes.ru", "as", "kvasz"));
        users.add(new User(6L,"Jassmine", "Brqw", "email@lor.ru", "as", "rasz"));
    }

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
