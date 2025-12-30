//  Exception Handling Problem #2
//  Problem: Age Validator
// Ask the user for their age.
// If the age is less than 18 or greater than 100, throw a custom exception InvalidAgeException.
// Catch the exception and display "Invalid age entered".
// If valid, print "Age accepted: <age>".

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

class AgeValidator {
    private int age;

    public AgeValidator(int age) {
        this.age = age;
    }

    public void Eligible() throws InvalidAgeException {
        if (age < 18 || age > 100)
            throw new InvalidAgeException("Invalid Age Entered. ");
        System.out.println("Age Accepted : " + age);

    }

}

class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter Age: ");
            AgeValidator age = new AgeValidator(sc.nextInt());
            age.Eligible();
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Enter Correct age.");
            e.printStackTrace();
        }
    }
}