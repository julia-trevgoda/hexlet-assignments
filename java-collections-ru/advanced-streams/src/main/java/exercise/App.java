package exercise;

import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

// BEGIN
class App {

    public static String getForwardedVariables(String configString) {
        return Stream.of(configString.split("\n"))
                .filter(s -> s.startsWith("environment="))
                .map(envString -> envString.substring(13, envString.length() - 1))
                .flatMap(variable -> Stream.of(variable.split(",")))
                .filter(str -> str.startsWith("X_FORWARDED_"))
                .map(pair -> pair.substring("\"X_FORWARDED_".length() - 1))
                .collect(joining(","));
    }
}
//END
