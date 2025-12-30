// Divide by Zero Exception

//  Write a program that takes two numbers from the user and divides them. Handle the case where the second number is zero.

// // Expected
// Enter first number: 10
// Enter second number: 0
// java.lang.ArithmeticException caught: / by zero
import java.util.Scanner;

class Division {
    private int a, b;
    private double res;
    Scanner sc = new Scanner(System.in);

    public Division() {
        System.out.print("Enter first number: ");
        this.a = sc.nextInt();
        System.out.print("Enter second number: ");
        this.b = sc.nextInt();
    }
 
    public void divide() {
        try {
            res = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Denominator can't be zero ");
        } finally {
            sc.close();
        }
    }
}

class Main {
    public static void main(String... args) {
        Division d = new Division();
        d.divide();
    }
}