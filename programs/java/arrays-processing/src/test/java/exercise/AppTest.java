package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void testGetElementsLessAverage() {
        int[] numbers1 = {};
        int[] result1 = App.getElementsLessAverage(numbers1);
        assertThat(result1).isEmpty();

        int[] numbers2 = {0, 1, 2, 3, 4, 5, 10, 12};
        int[] result2 = App.getElementsLessAverage(numbers2);
        int[] expected2 = {0, 1, 2, 3, 4};
        assertThat(result2).containsExactly(expected2);
    }

    //
    @Test
    void testGetIndexOfMaxNegative() {
        int[] numbers1 = {};
        int result1 = App.getIndexOfMaxNegative(numbers1);
        assertThat(result1).isEqualTo(-1);

        int[] numbers2 = {1, 2, 3, 4, 5};
        int result2 = App.getIndexOfMaxNegative(numbers2);
        assertThat(result2).isEqualTo(-1);

        int[] numbers3 = {-30, 42, -5, 31, -37, 25, -50};
        int result3 = App.getIndexOfMaxNegative(numbers3);
        assertThat(result3).isEqualTo(2);

        int[] numbers4 = {-30, 42, -6, -5, -5, 31, -37};
        int result4 = App.getIndexOfMaxNegative(numbers4);
        assertThat(result4).isEqualTo(3);

        int[] numbers5 = {-30, -42, 6, 5, 31, 3};
        int result5 = App.getIndexOfMaxNegative(numbers5);
        assertThat(result5).isEqualTo(0);
    }

    // BEGIN
    @Test
    void getSumBeforeMinAndMax() {
        int[] numbers1 = {5, 4, 34, 8, 11, -5, 1};
        int result1 = App.getSumBeforeMinAndMax(numbers1);
        assertThat(result1).isEqualTo(19);

        int[] numbers2 = {7, 1, 37, -5, 11, 8, 1};
        int result2 = App.getSumBeforeMinAndMax(numbers2);
        assertThat(result2).isEqualTo(0);
    }
    // END
}
