package exercise;

import java.util.Map;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage dbEntries) {

        Map<String, String> clonedInitial = dbEntries.toMap();

        for (Map.Entry<String, String> entry : clonedInitial.entrySet()) {
            dbEntries.unset(entry.getKey());
            dbEntries.set(entry.getValue(), entry.getKey());
        }
    }
}
// END
