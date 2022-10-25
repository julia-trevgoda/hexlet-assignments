package exercise;

import org.junit.jupiter.api.Test;

import static exercise.Point.*;
import static org.assertj.core.api.Assertions.assertThat;

class PointTest {
    @Test
    void testGetters() {
        int x = 4;
        int y = 5;
        var point = makePoint(x, y);
        assertThat(getX(point)).isEqualTo(x);
        assertThat(getY(point)).isEqualTo(y);
    }

    @Test
    void testToString() {
        var point = makePoint(4, -5);
        String expected = "(4, -5)";
        assertThat(pointToString(point)).isEqualTo(expected);
    }

    @Test
    void testGetQuadrant() {
        int actual1 = getQuadrant(makePoint(2, 3));
        assertThat(actual1).isEqualTo(1);

        int actual2 = getQuadrant(makePoint(-2, 3));
        assertThat(actual2).isEqualTo(2);

        int actual3 = getQuadrant(makePoint(-2, -3));
        assertThat(actual3).isEqualTo(3);

        int actual4 = getQuadrant(makePoint(2, -3));
        assertThat(actual4).isEqualTo(4);

        int actual5 = getQuadrant(makePoint(0, 3));
        assertThat(actual5).isEqualTo(0);

        int actual6 = getQuadrant(makePoint(-2, 0));
        assertThat(actual6).isEqualTo(0);
    }

    // BEGIN
    @Test
    void testGetSymmetricPoint() {
        int [] actual = getSymmetricalPointByX(makePoint(-3, -6));
        int [] expected = {-3, 6};
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testDistance() {
        var point1 = makePoint(0, 0);
        var point2 = makePoint(3, 4);
        int actual = calculateDistance(point1, point2);
        assertThat(actual).isEqualTo(5);
    }
    // END
}
