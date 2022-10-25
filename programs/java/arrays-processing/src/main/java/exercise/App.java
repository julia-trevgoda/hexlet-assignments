package exercise;

import java.util.Arrays;

class App {
    // BEGIN

    // task 1

    public static int getIndexOfMaxNegative(int[] arr1) {
        int result = -1;
        int minValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 0 && arr1[i] > minValue && arr1[i] != minValue) {
                result = i;
                minValue = arr1[i];
            }
        }
        return result;
    }


    // task 2

    public static int getAverage(int[] numArray) {
        int average = 0; // no need to know fractional part of average number

        for (int num : numArray) {
            average += num;
        }
        return average / numArray.length;
    }

    public static int getResultArrayLength(int[] numArray, int avgValue) {
        int resultArrayLength = 0;

        for (int a : numArray) {
            if (a <= avgValue) {
                resultArrayLength++;
            }
        }
        return resultArrayLength;
    }

    public static int[] getElementsLessAverage(int[] arr2) {
        if (arr2.length == 0) {return arr2;}

        int avgValue = getAverage(arr2);
        int[] resultArray = new int[getResultArrayLength(arr2, avgValue)];
        int i = 0;

        for (int value : arr2) {
            if (value <= avgValue) {
                resultArray[i++] = value;
            }
        }
        return resultArray;
    }

    // task 3

    public static int[] getIndexes(int[] numArray) {
        int minValue = numArray[0];
        int maxValue = numArray[0];
        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] < minValue) {
                minValue = numArray[i];
                minIndex = i;
            } else if (numArray[i] > maxValue) {
                maxValue = numArray[i];
                maxIndex = i;
            }
        }

        return minIndex < maxIndex ? new int[] {minIndex, maxIndex} : new int[] {maxIndex, minIndex};
    }

    public static int getSumBeforeMinAndMax(int[] arr3) {
        int[] minMaxIndexes = getIndexes(arr3);
        int sum = 0;

        if (minMaxIndexes[0] != -1 && minMaxIndexes[1] != -1) {
            for (int i = minMaxIndexes[0] + 1; i < minMaxIndexes[1]; i++) {
                sum += arr3[i];
            }
        }
        return sum;
    }
    // END
}
