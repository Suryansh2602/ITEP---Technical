// 2. Exception Handling Problem #1
//  Problem: Division Calculator
// Write a program that:
// Takes two integers as input.
// Performs division and handles ArithmeticException if the denominator is zero.
// Use a finally block to print "Program Completed".
// Sample Input/Output:
// Input: 10 0  
// Output: Cannot divide by zero  
// Program Completed

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter a number: ");
            int a = sc.nextInt();
            System.out.println("Enter Second number: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("\t" + a + "/" + b + "=" + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Enter Correct Integer Number ");
            e.printStackTrace();
        } finally {
            System.out.println("Program Completed");
        }
    }
}