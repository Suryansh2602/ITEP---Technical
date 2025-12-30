//  4. String Problem #2

// Reverse Each Word in a Sentence

// Input: "Java makes coding fun"

// Output: "avaJ sekam gnidoc nuf"

// Keep the word order intact but reverse the characters of each word.

class Word {
    String input;

    public Word(String input) {
        this.input = input;
    }

    public String reveString() {
        String result = "";
        int start = 0;
        for (int i = 0; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) == ' ') {
                for (int j = i - 1; j >= start; j--) {
                    result += input.charAt(j);
                }
                if (i != input.length()) {
                    result += " ";
                }
                start = i + 1;
            }
        }

        return result;
    }

}

class Main {
    public static void main(String[] args) {
        String input = "Java makes coding fun";
        System.out.println("Previous String : " + input);
        Word s = new Word(input);
        String result = s.reveString();
        System.out.println("Reversed Each Word : " + result);

    }
}
