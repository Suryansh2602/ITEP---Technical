//  Checked vs Unchecked Exception

//  Write a program with a method that throws IOException (checked) and another that throws ArithmeticException (unchecked). Show the difference in compiler behavior.

import java.io.IOException;
import java.util.Scanner;

class ExceptionDemo {
    // checked exception
    public void throwCheckedException() throws IOException {
        throw new IOException("This is a checked IOException");
    }

    // unchecked exception
    public void throwUncheckedException() {
        throw new ArithmeticException("This is an unchecked ArithmeticException");
    }
}

class Main {
    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose exception to throw (1 for checked, 2 for unchecked): ");
        int choice = sc.nextInt();
        if (choice == 1) {
            try {
                demo.throwCheckedException();
            } catch (IOException e) {
                System.out.println("Caught checked exception: " + e.getMessage());
            }
        } else if (choice == 2) {
            try {
                demo.throwUncheckedException();
            } catch (ArithmeticException e) {
                System.out.println("Caught unchecked exception: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}