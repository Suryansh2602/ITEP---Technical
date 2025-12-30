//WAP to find out total occurrence of each letter in string.

class LetterFrequency {
    public static void main(String[] args) {
        String input = "aabbccddd";
        String checked = "";  // to keep track of counted characters

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // skip if this character is already counted
            if (checked.indexOf(ch) != -1) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " - " + count + " times");
            checked = checked + ch;  // mark as counted
        }
    }
}