class Main {
    public static void main(String... args) {
        FormatString str = new FormatString();
        str.toLower("Hello");
        str.toUpper("Hello");

    }
}

class FormatString {

    private String result = "";

    public void toLower(String input) {

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // If it's a lowercase letter, convert to uppercase
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch;
            }
        }

        System.out.println(result);
    }

    public void toUpper(String input) {
        String res = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // If it's a lowercase letter, convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                res += (char) (ch - 32);
            } else {
                res += ch;
            }
        }

        System.out.println(res);
    }
}
