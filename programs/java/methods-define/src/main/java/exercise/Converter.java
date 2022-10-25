package exercise;

class Converter {
    // BEGIN
    public static int convert(int numToConvert, String direction) {
        int result;
        switch (direction) {
            case "b":
                result = numToConvert * 1024;
                break;
            case "Kb":
                result = numToConvert / 1024;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("10 Kb = " + convert(10, "b") + " b");
    }
    // END
}
