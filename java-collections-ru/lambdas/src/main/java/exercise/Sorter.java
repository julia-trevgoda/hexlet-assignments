package exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.util.Locale;
import java.util.Comparator;
import java.util.stream.Collectors;

// BEGIN
class Sorter {

    static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

    private static Date getDate(String userDate) {
        try {
            return formatter.parse(userDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<String> takeOldestMans(List<Map<String, String>> users) {

        return users.stream().filter(userMap -> userMap.get("gender").equals("male"))
                .sorted(Comparator.comparing(user -> getDate(user.get("birthday"))))
                .map(map -> map.get("name"))
                .collect(Collectors.toList());
    }
}
// END
