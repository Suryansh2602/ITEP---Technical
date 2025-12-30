// Write a program to print absolute vlaue of a number entered by user. E.g.-
// INPUT: 1        OUTPUT: 1
// INPUT: -1        OUTPUT: 1

import java.util.Scanner;
class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        
        if (number < 0) {
            number = -number; // Convert to positive
        }
        
        System.out.println("Absolute value: " + number);
    }
}