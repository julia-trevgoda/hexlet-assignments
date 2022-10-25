package exercise;

class App {
    // BEGIN
    public static String getTypeOfTriangle(int sideA, int sideB, int sideC) {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            if (sideA != sideB && sideB != sideC && sideA != sideC) {
                //System.out.println("Разносторонний");
                return "Разносторонний";
            } else if (sideA == sideB && sideB == sideC) {
                //System.out.println("Равносторонний");
                return "Равносторонний";
            } else {
                //System.out.println("Равнобедренный");
                return "Равнобедренный";
            }
        } else {
            //System.out.println("Треугольник не существует");
            return "Треугольник не существует";
        }
    }

    public static int getFinalGrade(int exam, int project) {
        if (exam > 90 || project > 10) {
            return 100;
        } else if (exam > 75 && project >= 5) {
            return 90;
        } else if (exam > 50 && project >= 2) {
            return 75;
        } else {
            return 0;
        }
    }
// END
}
