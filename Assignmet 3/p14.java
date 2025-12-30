// Write a program to accept percantage from the user and
// display grade according to the following criteria
//   Marks	  		Grade
//   > 90       		 A
//   >80 and <=90		 B
//   >=60 and <=80		 C
//   below 60		 D

import java.util.Scanner;
class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        if (percentage > 100 || percentage < 0) {
            System.out.println("Please enter a valid percentage between 0 and 100.");
        } else if (percentage > 90) {
            System.out.println("Grade: A");
        } else if (percentage > 80&&percentage<=90) {
            System.out.println("Grade: B");
        } else if (percentage >= 60&& percentage <= 80) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}