//  Write a Java program to compare two strings lexicographically Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions

class CheckString {
    private String a, b;

    public CheckString(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public Boolean Lexico() {
        if (a.length() != b.length())
            return false;
        else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    return false;

                }
            }
        }
        return true;
    }
}

class Main {
    public static void main(String... args) {
        String a = "Hello";
        String b = "Hello";
        CheckString ck = new CheckString(a, b);
        boolean res = ck.Lexico();
        if (res) {
            System.out.println("The String " + a + " is lexicographically equals to String " + b);
        } else {
            System.out.println("The String " + a + " and String " + b + " is not lexicographically Equal!");
        }

    }
}