package exercise;

import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        return Arrays.stream(image)
                .flatMap(line -> Stream.of(line, line))
                .map(doubledLine -> Arrays.stream(doubledLine)
                        .flatMap(str -> Stream.of(str, str))
                        .toArray(String[]::new)
                )
                .toArray(String[][]::new);
    }
}
// END
