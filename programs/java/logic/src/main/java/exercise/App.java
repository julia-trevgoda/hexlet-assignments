package exercise;

class App {
    public static boolean isBigOdd(int number) {
        // BEGIN
        boolean isBigOddVariable;
        isBigOddVariable = number % 2 > 0 && number >= 1001;
        // END
        return isBigOddVariable;
    }

    public static void sayEvenOrNot(int number) {
        // BEGIN
        if (number % 2 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        // END
    }

    public static void printPartOfHour(int minutes) {
        // BEGIN
        if (minutes < 15) {
            System.out.println("First");
        } else if (minutes < 30) {
            System.out.println("Second");
        } else if (minutes < 45) {
            System.out.println("Third");
        } else {
            System.out.println("Fourth");
        }
        // END
    }
}
