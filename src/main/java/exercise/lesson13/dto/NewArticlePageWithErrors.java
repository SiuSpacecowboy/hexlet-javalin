package exercise.lesson13.dto;

import io.javalin.validation.ValidationError;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class NewArticlePageWithErrors {

    private String name;
    private String text;
    private Map<String, List<ValidationError<Object>>> errors;
}
