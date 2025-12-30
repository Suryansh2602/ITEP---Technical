
// 7. Write a Java program to concatenate a given string to the end of another string
import java.util.Scanner;

class Concate {
    private String a, b;

    public Concate(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String m1() {
        return a.concat(b);
    }

}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter the Second String: ");
        String str2 = sc.next();

        Concate s = new Concate(str, str2);
        String res = s.m1();
        System.out.println("New String is : " + res);
    }

}
