package main_project.dao;

import main_project.dto.User;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public interface UserDao {

    public Long save(User user);

    public List<User> getUsers() ;

    public User findUserById(Long id);

    public void editUser(User user, Long id);
}
