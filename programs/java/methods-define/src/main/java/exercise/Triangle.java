package exercise;

class Triangle {
    // BEGIN
    public static double getSquare(double sideA, double sideB, double angle) {
        return (sideA * sideB) / 2 * Math.sin((angle * Math.PI) / 180);
    }

    public static void main(String[] args) {
        System.out.println(getSquare(4, 5, 45));
    }
    // END
}
