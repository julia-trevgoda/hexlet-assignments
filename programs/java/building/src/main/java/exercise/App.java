// BEGIN
package exercise;

import com.google.gson.Gson;

public class App {

    public static String toJson(String[] stringArray) {
        Gson gson = new Gson();
        return gson.toJson(stringArray);
    }

    public static void main(String[]args) {
        System.out.println("Hello, World!");
    }
}
// END
