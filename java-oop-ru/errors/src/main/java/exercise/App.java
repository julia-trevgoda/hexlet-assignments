package exercise;

// BEGIN
public class App {

    public static final String CALCULATE_SQUARE_ERROR = "Не удалось посчитать площадь";

    public static void printSquare(Circle circle) {
        try {
            System.out.println(Math.round(circle.getSquare()));
        } catch (NegativeRadiusException e) {
            System.out.println(CALCULATE_SQUARE_ERROR);
        }
        System.out.println("Вычисление окончено");
    }
}
// END
