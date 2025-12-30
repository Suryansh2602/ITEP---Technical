//   Write a java program to find all possible palindrom of given String.

class ReverseString {
    private String str;
    private String rev = "";

    public ReverseString(String str) {
        this.str = str;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);

        }
    }

    public String revString() {
        return rev;
    }
}

class Main {
    public static void main(String[] args) {
        String str = " aaabbbacccababacccaabb";
        ReverseString obj = new ReverseString(str);
        System.out.println("l String : " + str);
        obj.revString();
        if (str == obj.revString()) {
            System.out.println("String is Palindrome...");
        } else {
            System.out.println("String is not palindrome...");
        }

    }
}