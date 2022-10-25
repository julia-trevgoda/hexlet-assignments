package exercise;

import java.util.*;

// BEGIN
class App {

    public static boolean scrabble(String chars, String word) {

        List<Character> charsList = new ArrayList<>();
        List<Character> wordList = new ArrayList<>();

        if (chars.length() > 0) {
            for (char ch : chars.toLowerCase().toCharArray()) {
                charsList.add(ch);
            }
        } else {
//            System.out.println("false");
            return false;
        }

        for (char letter : word.toLowerCase().toCharArray()) {
            wordList.add(letter);
        }

        int countOfMatches = 0;

        for (Character charFromWord : wordList) {
             if (charsList.remove(charFromWord)) {
                 countOfMatches++;
             }
        }

//        System.out.println(countOfMatches == wordList.size());
        return countOfMatches == wordList.size();
    }

//    public static void main(String[] args) {
//        scrabble("", "java");
//    }
}
//END
