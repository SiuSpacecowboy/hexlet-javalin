package exercise.lesson16.dto;

import io.javalin.validation.ValidationError;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Getter
public class UserEditPageWithErrors {

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
