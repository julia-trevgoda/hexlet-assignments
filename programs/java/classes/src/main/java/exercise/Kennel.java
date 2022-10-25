package exercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;


// BEGIN
public class Kennel {

    static int currentCount = 0;
    static String[][] kennel = new String[10][2]; //considering the kennel's capacity is limited to 10

    public static void addPuppy(String[] puppy) {
        if (currentCount < 10) {
            kennel[currentCount] = puppy;
            currentCount++;
        } else System.out.println("Sorry, there are no places here anymore.");
    }

    public static int getPuppyCount() {
        return currentCount;
    }

    public static String[][] getAllPuppies() {
        String[][] listOfPuppies = new String[currentCount][2];
        if (currentCount != 0) {
            System.arraycopy(kennel, 0, listOfPuppies, 0, currentCount);
        }
        return listOfPuppies;
    }

    public static void addSomePuppies(String[][] puppies) {
        if (getPuppyCount() + puppies.length < kennel.length) {
            for (int i = 0; i < puppies.length; i++) {
                kennel[getPuppyCount()] = puppies[i];
                currentCount++;
            }
        } else {
            System.out.println("Sorry, there are no places here anymore.");
        }
    }

    public static void resetKennel() {
        currentCount = 0;
    }

    public static boolean isContainPuppy(String puppyName) {
        if (currentCount > 0) {
            for (int i = 0; i < currentCount; i++) {
                if (kennel[i][0].equals(puppyName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String[] getNamesByBreed(String breed) {
        int countPuppiesByBreed = 0;

        for (int i = 0; i < currentCount; i++) {
            if (kennel[i][1].equals(breed)) {
                countPuppiesByBreed++;
            }
        }

        String[] namesByBreed = new String[countPuppiesByBreed];
        int indexNames = 0;

            for (int k = 0; k < currentCount; k++) {
                if (kennel[k][1].equals(breed)) {
                    namesByBreed[indexNames] = kennel[k][0];
                    indexNames++;
                }
                if (indexNames == countPuppiesByBreed) break;
            }
        return namesByBreed;
    }

    public static boolean removePuppy(String puppyName) {
        if (!isContainPuppy(puppyName)) return false;
        int tempIndex = 0;
        String[][] tempKennel = new String[10][2];
        for (int i = 0; i < currentCount; i++) {
            if (!kennel[i][0].equals(puppyName)) {
                tempKennel[tempIndex++] = kennel[i];
            }
        }
        currentCount--;
        kennel = tempKennel;
        return true;
    }
}
// END
