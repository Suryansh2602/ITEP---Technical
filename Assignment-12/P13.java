// Online Exam System

// A student enters their roll number (integer), but by mistake they enter "abc".

// Which exception will occur?

// How can you catch it and ask them to re-enter?

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int roll;
        boolean valid = false;
        System.out.println("Enter Roll Number: ");
        do {
            try {
                roll = sc.nextInt();
                valid = true;
                System.out.println("Your Roll Number is now: " + roll);
            } catch (InputMismatchException e) {
                System.out.println("Invalid Roll Number, Please Enter Again: ");
                sc.next(); // clear the invalid input
                valid = false;
            }
        } while (!valid);
        sc.close();
    }

}
