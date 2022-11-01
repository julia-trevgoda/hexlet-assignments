package exercise;

// BEGIN
public class Circle {

    public static final String NEGATIVE_RADIUS_EXCEPTION = "Radius can not be negative";

    private final exercise.Point point;
    private final int radius;

    public Circle(exercise.Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (getRadius() >= 0) {
            return Math.PI * radius * radius;
        } else {
            throw new NegativeRadiusException(NEGATIVE_RADIUS_EXCEPTION);
        }
    }
}
// END
