package main_project.dto;

import exercise.lesson19_flash_m.BasePage;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class UsersPage extends BasePage {

    private List<User> users;
}
