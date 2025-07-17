// 4.A school has following rules for grading system:
// a. Below 25 - F
// b. 25 to 45 - E
// c. 45 to 50 - D
// d. 50 to 60 - C
// e. 60 to 80 - B
// f. Above 80 - A
// Ask user to enter marks and print the corresponding grade.

import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the grades Between 1 to 100: ");
        int grade = sc.nextInt();
        
        if(grade < 25&& grade >= 1) {
            System.out.println("Grade: F");
        } else if (grade >= 25 && grade < 45) {
            System.out.println("Grade: E");
        } else if (grade >= 45 && grade < 50) {
            System.out.println("Grade: D");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("Grade: C");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("Grade: B");
        } else if (grade >= 80 && grade <= 100) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Invalid marks entered. Please enter a value between 1 and 100.");
        }
    }
}