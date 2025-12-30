// 1. Write a Java program to concatenate Two strings

class Main {
    public static void main(String args[]) {
        String str = "Hello";
        String str2 = " World!";
        String res = concatenate(str, str2);
        System.out.println(res);

    }

    public static String concatenate(String str1, String str2) {
        String res = "";
        res = str1 + str2;
        return res;
    }
}