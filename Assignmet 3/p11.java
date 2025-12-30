// Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
// if employee is female, then she will work only in urban areas.
// if employee is a male and age is in between 20 to 40 then he may work in anywhere
// if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
// And any other input of age should print "ERROR". 

import java.util.Scanner;

class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 20 || age <= 60) {

            System.out.println("Enter Gender (m/f): ");
            char gender = sc.next().charAt(0);

            if (gender == 'f') {
                System.out.println("Place of service: Urban areas only.");
            } else if (gender == 'm' && age >= 20 && age <= 40) {
                System.out.println("Place of service: Anywhere.");
            } else if (gender == 'm' && age > 40 && age <= 60) {
                System.out.println("Place of service: Urban areas only.");
            } else {
                System.out.println("ERROR: Invalid age input.");
            }
        }
    }
}
