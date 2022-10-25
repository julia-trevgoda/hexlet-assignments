package exercise;

class Point {
    // BEGIN

    public static int[] makePoint(int x, int y) {
        return new int[]{x, y};
    }

    public static int getX(int[] point) {
        return point[0];
    }

    public static int getY(int[] point) {
        return point[1];
    }

    public static int getQuadrant(int[] point) {
        if (point[0] > 0 && point[1] > 0) {
            return 1;
        } else if (point[0] > 0 && point[1] < 0) {
            return 4;
        } else if (point[0] < 0 && point[1] > 0) {
            return 2;
        } else if (point[1] < 0) {
            return 3;
        } else return 0;
    }


    public static String pointToString(int[] point) {
        return "(" + point[0] + ", " + point[1] + ")";
    }

    public static int[] getSymmetricalPointByX(int[] point) {
        return new int[] {point[0], point[1] * -1};
    }

    public static int calculateDistance(int[] point1, int[] point2) {
        return (int) Math.sqrt(Math.pow((point2[0] - point1[0]), 2) + Math.pow((point2[1] - point1[1]), 2));
    }

    // END
}
