package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildAppartmentsList(List<Home> appartmentsList, int n) {
        return appartmentsList.stream()
                .sorted((Home::compareTo))
                .limit(n)
                .map(Home::toString)
                .collect(Collectors.toList());
    }
}
// END
