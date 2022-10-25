package exercise;

import java.util.Arrays;

class App {
    // BEGIN
    public static int[] bubbleSort(int[] numArray) {
        int temp;
        int f = 0;

        if (numArray.length == 0) return numArray;

        for (int run = 1; run < numArray.length; run++) {
            for (int i = 0; i < numArray.length - run; i++) {
                if (numArray[i] > numArray[i+1]) {
                    temp = numArray[i];
                    numArray[i] = numArray[i+1];
                    numArray[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numArray));
        return numArray;
    }

    public static int[] selectionSort(int[] numArray) {

        if (numArray.length == 0) return numArray;

        for (int i = 0; i < numArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i +1; j < numArray.length; j++ ) {
                if (numArray[j] < numArray[minIndex]) {
                    minIndex = j;
                }
            }
            int tmpI = numArray[i];
            numArray[i] = numArray[minIndex];
            numArray[minIndex] = tmpI;
        }
        return numArray;
    }
    // END

//    public static void main(String[] args) {
//        int[] abc = {100, 80, 3, 4,5,6,7};
//        System.out.println(Arrays.toString(selectionSort(abc)));
//        System.out.println(Arrays.toString(bubbleSort(abc)));
//    }

}
