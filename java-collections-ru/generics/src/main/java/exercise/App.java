package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> resultBooks = new ArrayList<>();
        for (Map<String, String> book : books) {
            int bookCheck = 0;

            for (Map.Entry<String, String> bookParam : book.entrySet()) {
                if (where.containsKey(bookParam.getKey())
                        && where.get(bookParam.getKey()).equals(bookParam.getValue())) {
                    bookCheck++;
                }
            }
            if (bookCheck == where.size()) {
                resultBooks.add(book);
            }
        }
        return resultBooks;
    }
}
//END
