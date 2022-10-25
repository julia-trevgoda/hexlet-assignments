package exercise;

import java.util.Arrays;
import java.util.List;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emails) {

        String[] domains = {"gmail.com", "hotmail.com", "yandex.ru"};

        return (int) emails.stream()
                .filter(email -> Arrays.stream(domains).anyMatch(email::endsWith))
                .count();
    }
}
// END
