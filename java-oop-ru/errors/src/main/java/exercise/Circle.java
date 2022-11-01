package exercise;

// BEGIN
public class Circle {

    public static final String NEGATIVE_RADIUS_EXCEPTION = "Не удалось посчитать площадь";

    private final exercise.Point point;
    private final int radius;

    public Circle(exercise.Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int getSquare() throws NegativeRadiusException {
        if (radius > 0) {
            return (int) Math.round(Math.PI * radius * radius);
        } else {
            throw new NegativeRadiusException(NEGATIVE_RADIUS_EXCEPTION);
        }
    }
}
// END
