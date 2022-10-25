package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void testGetTypeOfTriangle1() {
        String result = App.getTypeOfTriangle(1, 2, 7);
        assertThat(result).isEqualTo("Треугольник не существует");
    }

    @Test
    void testGetTypeOfTriangle2() {
        String result = App.getTypeOfTriangle(5, 6, 7);
        assertThat(result).isEqualTo("Разносторонний");
    }

    @Test
    void testGetTypeOfTriangle3() {
        String result = App.getTypeOfTriangle(5, 6, 5);
        assertThat(result).isEqualTo("Равнобедренный");
    }

    @Test
    void testGetTypeOfTriangle4() {
        String result = App.getTypeOfTriangle(5, 5, 5);
        assertThat(result).isEqualTo("Равносторонний");
    }

    @Test
    void testGetTypeOfTriangle5() {
        String result = App.getTypeOfTriangle(1, -2, 7);
        assertThat(result).isEqualTo("Треугольник не существует");
    }
    // BEGIN
    @Test
    void getFinalGrade1() {
        int result = App.getFinalGrade(100, 12);
        assertThat(result).isEqualTo(100);
    }

    @Test
    void getFinalGrade2() {
        int result = App.getFinalGrade(99, 0);
        assertThat(result).isEqualTo(100);
    }

    @Test
    void getFinalGrade3() {
        int result = App.getFinalGrade(10, 15);
        assertThat(result).isEqualTo(100);
    }

    @Test
    void getFinalGrade4() {
        int result = App.getFinalGrade(85, 5);
        assertThat(result).isEqualTo(90);
    }

    @Test
    void getFinalGrade5() {
        int result = App.getFinalGrade(55, 3);
        assertThat(result).isEqualTo(75);
    }

    @Test
    void getFinalGrade6() {
        int result = App.getFinalGrade(55, 0);
        assertThat(result).isEqualTo(0);
    }
    // END
}
