package exercise;

class Card {
    public static void printHiddenCard(String cardNumber, int starsCount) {
        // BEGIN
        String lastChars = cardNumber.substring(12, 16);
        String stars = "";
        for (int j = 1; j <= starsCount; j++) {
            stars += "*";
        }
        System.out.println(stars + lastChars);
        // END
    }
}
