package exercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTestSorter {
    @Test
    void testTakeOldestMans() {
        List<Map<String, String>> users1 = List.of(
                Map.of("name", "Vladimir Nikolaev", "birthday", "1990-12-27", "gender", "male"),
                Map.of("name", "Andrey Petrov", "birthday", "1989-11-23", "gender", "male"),
                Map.of("name", "Anna Sidorova", "birthday", "1996-09-09", "gender", "female"),
                Map.of("name", "John Smith", "birthday", "1989-03-11", "gender", "male"),
                Map.of("name", "Vanessa Vulf", "birthday", "1985-11-16", "gender", "female"),
                Map.of("name", "Alice Lucas", "birthday", "1986-01-01", "gender", "female"),
                Map.of("name", "Elsa Oscar", "birthday", "1970-03-10", "gender", "female")
        );
        List<String> expected1 = Arrays.asList("John Smith", "Andrey Petrov", "Vladimir Nikolaev");
        assertThat(Sorter.takeOldestMans(users1)).isEqualTo(expected1);



        List<Map<String, String>> users2 = List.of(
                Map.of("name", "Anna Sidorova", "birthday", "1996-09-09", "gender", "female"),
                Map.of("name", "Vanessa Vulf", "birthday", "1985-11-16", "gender", "female"),
                Map.of("name", "Alice Lucas", "birthday", "1986-01-01", "gender", "female"),
                Map.of("name", "Elsa Oscar", "birthday", "1970-03-10", "gender", "female")
        );
        List<String> expected2 = List.of();
        assertThat(Sorter.takeOldestMans(users2)).isEqualTo(expected2);



        List<Map<String, String>> users3 = List.of(
                Map.of("name", "Vladimir Nikolaev", "birthday", "1990-12-27", "gender", "male"),
                Map.of("name", "John Smith", "birthday", "1989-03-11", "gender", "male"),
                Map.of("name", "Andrey Petrov", "birthday", "1989-11-23", "gender", "male"),
                Map.of("name", "Ivan Ivanov", "birthday", "1989-11-23", "gender", "male")
        );
        List<String> expected3 = Arrays.asList("John Smith", "Andrey Petrov", "Ivan Ivanov", "Vladimir Nikolaev");
        assertThat(Sorter.takeOldestMans(users3)).isEqualTo(expected3);
    }
}
// END


