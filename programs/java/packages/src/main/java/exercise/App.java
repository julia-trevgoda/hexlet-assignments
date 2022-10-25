// BEGIN
package exercise;

import exercise.geometry.Point;
import exercise.geometry.Segment;

public class App {

    public static double[] getMidpointOfSegment(double[][] segment) {

        double[] beginPoint = Segment.getBeginPoint(segment);
        double[] endPoint = Segment.getEndPoint(segment);

        return Point.makePoint(((beginPoint[0] + endPoint[0]) / 2), ((beginPoint[1] + endPoint[1]) / 2));
    }

    public static double[][] reverse(double[][] segment) {

        double[][] segmentToReverse = new double[2][2];

        segmentToReverse[0] = new double[]{segment[0][0], segment[0][1]};
        segmentToReverse[1] = new double[]{segment[1][0], segment[1][1]};

        double[] reversedBeginPoint = Segment.getEndPoint(segmentToReverse);
        double[] reversedEndPoint = Segment.getBeginPoint(segmentToReverse);

        return Segment.makeSegment(reversedBeginPoint, reversedEndPoint);
    }

    public static int getQuadrant(double[] point) {
        if (point[0] > 0 && point[1] > 0) {
            return 1;
        } else if (point[0] > 0 && point[1] < 0) {
            return 4;
        } else if (point[0] < 0 && point[1] > 0) {
            return 2;
        } else if (point[1] < 0) {
            return 3;
        } else return 0;
    }

    public static boolean isBelongToOneQuadrant(double[][] segment) {
        if (getQuadrant(Segment.getBeginPoint(segment)) == getQuadrant(Segment.getEndPoint(segment))) {
            return true;
        }
        return false;
    }
}
// END
