package main_project.dto;

import exercise.lesson19_flash_m.BasePage;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserPage extends BasePage {

    private User user;
}
