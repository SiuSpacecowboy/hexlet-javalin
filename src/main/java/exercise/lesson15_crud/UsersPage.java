package exercise.lesson15_crud;

import lombok.AllArgsConstructor;
import lombok.Getter;
import main_project.dto.User;

import java.util.List;

@AllArgsConstructor
@Getter
public class UsersPage {

    private List<User> users;
    private Long page;
    private Long finalPage;
    private boolean haveUsers;
}
