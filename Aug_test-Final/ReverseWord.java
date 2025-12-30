// Write a Java program to reverse each word in a string while keeping the word order same.
// Example:

// Input: "Java is very simple"
// Output: "avaJ si yrev elpmis"

class ReverseWords {
    public static void main(String[] args) {
        String input = "Java is very simple";
        String result = "";

        int start = 0;
        for (int i = 0; i <= input.length()-1; i++) {
            if (i == input.length() - 1 || input.charAt(i) == ' ') {
                for (int j = i - 1; j >= start; j--) {
                    result += input.charAt(j);
                }
                if (i != input.length()) {
                    result += " ";
                }
                start = i + 1;
            }
        }

        System.out.println(result);

    }
}
