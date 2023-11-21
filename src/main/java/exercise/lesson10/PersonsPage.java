package exercise.lesson10;

import java.util.List;

public class PersonsPage {

    private List<Person> persons;
    private String term;

    public PersonsPage(List<Person> persons, String term) {
        this.persons = persons;
        this.term = term;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public String getTerm() {
        return term;
    }
}
