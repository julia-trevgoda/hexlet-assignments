// BEGIN
package exercise.geometry;

public class Segment {

// makeSegment() — принимает на вход две точки и возвращает отрезок.
// getBeginPoint() — принимает на вход отрезок и возвращает точку начала отрезка.
// getEndPoint() — Принимает на вход отрезок и возвращает точку конца отрезка.

    public static double[][] makeSegment(double[] point1, double[] point2) {
        double[][] segment = {point1, point2};
        return segment;
    }

    public static double[] getBeginPoint(double[][] segment) {
        return segment[0];
    }

    public static double[] getEndPoint(double[][] segment) {
        return segment[1];
    }

}

// END
