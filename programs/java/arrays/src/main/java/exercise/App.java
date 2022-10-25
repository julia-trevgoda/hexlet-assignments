package exercise;

import java.util.Arrays;

class App {
    // BEGIN
    public static int[] reverse(int[] numbers) {
        int[] resultArray = new int[numbers.length];
        if (numbers.length != 0) {
            for (int i = numbers.length - 1; i >= 0; i--) {
                resultArray[numbers.length - (i + 1)] = numbers[i];
            }
        }
//        System.out.println(Arrays.toString(resultArray));
        return resultArray;
    }

    public static int mult(int[] numbers1) {
        int multResult = 1;
//        for (int i = 0; i < numbers1.length; i++) {
//            multResult *= numbers1[i];
//        }
        for (int num : numbers1) {
            multResult *= num;
        }
//        System.out.println(multResult);
        return multResult;
    }

    public static int[] flattenMatrix(int[][] matrix) {
        int resultArrayLength = 0;
        for (int i = 0; i < matrix.length; i++) {
            resultArrayLength += matrix[i].length;
        }
        int[] result = new int[resultArrayLength];
        if (resultArrayLength != 0) {
            int r = 0;
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    result[r] = matrix[j][k];
                    r++;
                }
            }
        }
//      System.out.println(Arrays.toString(result));
        return result;
    }
    // END
}
