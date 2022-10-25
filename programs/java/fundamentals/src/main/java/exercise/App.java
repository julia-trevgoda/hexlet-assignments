package exercise;

class App {
    public static void numbers() {
        // BEGIN
        int a = 8 / 2;
        int b = 100 % 3;
        System.out.println(a + b);
        // END
    }

    public static void strings() {
        String language = "Java";
        // BEGIN
        System.out.println(language + " works on JVM");
        // END
    }

    public static void converting() {
        Number soldiersCount = 300;
        String name = "spartans";
        // BEGIN
        System.out.println(soldiersCount + " " + name);
        // END
    }
}
