package exercise;

class App {
    // BEGIN
    public static String getAbbreviation(String phrase) {
        String testPhrase = phrase.trim();
        String[] phraseArray = testPhrase.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < phraseArray.length; i++) {
            if (!phraseArray[i].isEmpty()) {
                result.append(phraseArray[i].charAt(0));
            }
        }
        System.out.println(result.toString().toUpperCase());
        return result.toString().toUpperCase();
    }
    // END
}
