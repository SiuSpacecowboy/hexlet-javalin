package exercise.lesson12.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class UsersPage {

    private List<User> users;
    private User user;
}
