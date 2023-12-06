package main_project.dto;

import exercise.lesson19_flash_m.BasePage;
import io.javalin.validation.ValidationError;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserPageWithErrors extends BasePage {

    private String firstName;
    private String lastName;
    private String email;
    private Map<String, List<ValidationError<Object>>> errors;
}
