// 6. Write a Java program to compare two strings lexicographically , ignoring case differences

class CheckString {
    private String a, b;

    public CheckString(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public Boolean Lexico() {
        if (a.length() != b.length())
            return false;
        else if (a.compareToIgnoreCase(b)==0) {
            return true;

        }
        return false;
    }
}

class Main {
    public static void main(String... args) {
        String a = "Hello";
        String b = "hellO";
        CheckString ck = new CheckString(a, b);
        boolean res = ck.Lexico();
        System.out.println(res ? "Yes" : "no");

    }
}