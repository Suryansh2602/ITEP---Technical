// WAP to exchange value of two variable without using third variable and arithmetic operator
import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value (A): ");
        int a = sc.nextInt();

        System.out.print("Enter the second value (B): ");
        int b = sc.nextInt();

        System.out.println("Before swapping: A = " + a + ", B = " + b);

         a = a+b;
         b = a-b;
         a = a-b;
         System.out.println("After swapping: A = " + a + ", B = " + b);
    }
};