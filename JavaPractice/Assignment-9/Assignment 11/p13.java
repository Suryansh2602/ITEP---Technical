//7)WAP to remove the duplicate letters from given String.

class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "aabbccddd";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // if character not already present in result, add it
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Output: " + result);
    }
}