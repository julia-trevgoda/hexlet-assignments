package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void testSort() {
        int[] numbers1 = {};
        int[] result1 = App.bubbleSort(numbers1);
        assertThat(result1).isEmpty();

        int[] numbers2 = {10, 1, 3};
        int[] result2 = App.bubbleSort(numbers2);
        int[] expected2 = {1, 3, 10};
        assertThat(result2).containsExactly(expected2);

        int[] numbers3 = {0, 4, 0, 10, -3};
        int[] result3 = App.bubbleSort(numbers3);
        int[] expected3 = {-3, 0, 0, 4, 10};
        assertThat(result3).containsExactly(expected3);

        int[] numbers4 = {};
        int[] result4 = App.selectionSort(numbers4);
        assertThat(result4).isEmpty();

        int[] numbers5 = {10, 1, 3};
        int[] result5 = App.selectionSort(numbers5);
        int[] expected5 = {1, 3, 10};
        assertThat(result5).containsExactly(expected5);

        int[] numbers6 = {0, 4, 0, 10, -3};
        int[] result6 = App.selectionSort(numbers6);
        int[] expected6 = {-3, 0, 0, 4, 10};
        assertThat(result6).containsExactly(expected6);
    }
}
