package exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        //test on right + wrong3 (checking 'count < length' condition) implementations
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2));
        assertThat(App.take(numbers1, 2)).isEqualTo(expected1);

        //test on right + wrong2 (checking 'count > length' condition) implementations
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(5, 6, 7));
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(5, 6, 7));
        assertThat(App.take(numbers2, 5)).isEqualTo(expected2);

        //test on wrong1 implementation
        List<Integer> numbers3 = new ArrayList<>();
        List<Integer> expected3 = new ArrayList<>();
        assertThat(App.take(numbers3, 1)).isEqualTo(expected3);

        //test on wrong3 implementation (checking count == length condition)
        List<Integer> numbers4 = new ArrayList<>(Arrays.asList(100, 1000));
        List<Integer> expected4 = new ArrayList<>(Arrays.asList(100, 1000));
        assertThat(App.take(numbers4, 2)).isEqualTo(expected4);
        // END
    }
}
