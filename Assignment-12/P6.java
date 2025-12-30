// Finally Block Practice

// Open a Scanner, read an input, and always close the scanner in finally (show that finally always executes).

import java.util.Scanner;

class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("An error occurred: ");
            e.printStackTrace();
        } finally {
            sc.close();
            System.out.println("Scanner closed in finally block.");
        }
    }
}
