package exercise.lesson16_mvc.dto;

import exercise.lesson19_flash_m.BasePage;
import io.javalin.validation.ValidationError;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Getter
public class UserEditPageWithErrors extends BasePage {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Map<String, List<ValidationError<Object>>> errors;

    public UserEditPageWithErrors(Long id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}
