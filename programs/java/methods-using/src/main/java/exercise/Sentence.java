package exercise;

//import java.util.Locale;

class Sentence {
    public static void printSentence(String sentence) {
        // BEGIN
        char lastChar = sentence.charAt(sentence.length() - 1);
        if (lastChar == '!') {
            System.out.println(sentence.toUpperCase());
       } else {
            System.out.println(sentence.toLowerCase());
        }
        // END
    }
}

