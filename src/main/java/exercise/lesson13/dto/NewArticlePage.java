package exercise.lesson13.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Getter
public class NewArticlePage {

    private Map<String, Article> allArticles;

}
