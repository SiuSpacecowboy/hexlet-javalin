package main_project.dao;

import exercise.lesson20_database.BaseRepository;
import main_project.dto.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoDB extends BaseRepository implements UserDao {

    private static Long ID = 0L;

    public Long save(User user) {
        try {
            PreparedStatement prep = dataSource.getConnection().prepareStatement("INSERT INTO users(firstName, lastName, email, pass, token)" +
                    " VALUES(?, ?, ?, ?, ?)");
            System.out.println(user.getPassword());
            prep.setString(1, user.getFirstName());
            prep.setString(2, user.getLastName());
            prep.setString(3, user.getEmail());
            prep.setString(4, user.getPassword());
            prep.setString(5, user.getToken());
            prep.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(ID);
        return ++ID;
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        String SQL = "SELECT * FROM users";
        Statement statement;
        try {
            statement = dataSource.getConnection().createStatement();
            ResultSet result = statement.executeQuery(SQL);
            while (result.next()) {
                User user = new User();
                user.setId(result.getLong("id"));
                user.setFirstName(result.getString("firstName"));
                user.setLastName(result.getString("lastName"));
                user.setEmail(result.getString("email"));
                user.setPassword(result.getString("pass"));
                user.setToken(result.getString("token"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public User findUserById(Long id) {
        User user = null;
        try {
            PreparedStatement preparedStatement = dataSource.getConnection().prepareStatement("SELECT * FROM users WHERE id = ?");
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            user = new User(resultSet.getLong("id"), resultSet.getString("firstName"),
                    resultSet.getString("lastName"), resultSet.getString("email"),
                    resultSet.getString("pass"), resultSet.getString("token"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void editUser(User user, Long id) {
        try {
            PreparedStatement preparedStatement = dataSource.getConnection().prepareStatement(
                    "UPDATE users SET firstName = ?, lastName = ?, email = ?, pass = ?, token = ? WHERE id = ?");
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getToken());
            preparedStatement.setLong(6, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
