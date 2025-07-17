// Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
import java.util.Scanner;   
class P1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " lowercase letter.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " uppercase letter.");
        } else {
            System.out.println(ch + " not an alphabetic character.");

    }
}
}
