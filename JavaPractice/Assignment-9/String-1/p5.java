
//  Write a java program to reverse each word of String.
import java.lang.String;

class ReverseString {
    private String str;
    private String rev = "";

    public ReverseString(String str) {
        this.str = str;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);

        }
    }

    public void revString() {
        System.out.println("Reversed String is :" + rev);

    }
}

class Main {
    public static void main(String[] args) {
        String str = "Java is platform Independent";
        String result = "";
        int start = 0;
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                for (int j = i - 1; j >= start; j--) {
                    result += str.charAt(j);
                }

                if (i != str.length()) {
                    result += " ";
                }
                start = i + 1;
            }
        }
        System.out.println(result);

    }
}