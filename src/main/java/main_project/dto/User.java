package main_project.dto;

import exercise.lesson19_flash_m.BasePage;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public final class User extends BasePage {

    private Long id;
    private String firstName;
    @ToString.Include
    private String lastName;
    private String email;
    private String password;
    private String token;

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public User(String firstName, String lastName, String email, String password, String token) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.token = token;
    }
}
