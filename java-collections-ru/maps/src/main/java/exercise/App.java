package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String sentence) {

        Map<String, Integer> wordCountMap = new HashMap<>();

        if (sentence.isEmpty()) {
            return wordCountMap;
        }

        String[] wordsList = sentence.split(" ");

        for (String word : wordsList) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
//        System.out.println(wordCountMap);
        return wordCountMap;
    }

    public static String toString(Map<String, Integer> wordsMap) {

        StringBuilder mapToString = new StringBuilder();
        mapToString.append("{");
        if (!wordsMap.isEmpty()) {
            mapToString.append("\n");
            for (Map.Entry<String, Integer> word : wordsMap.entrySet()) {
                mapToString.append("  " + word.getKey() + ": " + word.getValue() + "\n");
            }
        }
        mapToString.append("}");
//        System.out.println(String.valueOf(mapToString));
        return String.valueOf(mapToString);
    }

//        public static void main(String[] args) {
//            Map<String, Integer> actual1 = getWordCount("");
//            toString(actual1);
//    }
}
//END
