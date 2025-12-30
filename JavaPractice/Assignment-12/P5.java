// Multiple Catch Blocks

// 👉 Take two integers and perform division. Handle both ArithmeticException and InputMismatchException separately.
import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("Result: " + res);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException caught");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException caught: " + e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
