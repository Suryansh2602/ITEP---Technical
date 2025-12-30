// public Write a Java program to check whether a number is divisible by 5 and 11 or not. p38 

import java.util.Scanner;

class P1 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        } else if (num % 11 == 0) {
            System.out.println("The number is divisible by 11.");
        } else if (num % 5 != 0 && num % 11 != 0) {
            System.out.println("The number is not divisible by 5 or 11.");
        } else {
            System.out.println("The Input is not valid.");
        }
    }
}
