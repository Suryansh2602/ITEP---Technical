//WAP to find word of maximum length in given String.

class MaxWordLength {
    public static void main(String[] args) {
        String input = "Dear Student ,You have need to work hard";

        // Split the string into words (using space and punctuation as delimiters)
        String[] words = input.split("[ ,]+");

        String maxWord = "";
        for (String word : words) {
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Word with maximum length: " + maxWord);
    }
}