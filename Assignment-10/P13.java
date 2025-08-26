// Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
// init - to input radius from user
// calc - to calculate area
// display- to display area

import java.util.Scanner;

class Circle {
    // Data members
    private double radius;
    private double area;

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();
        sc.close();
    }

    // Method to calculate area
    public void calc() {
        area = 3.14 * radius * radius;
    }

    // Method to display area
    public void display() {
        System.out.println("Area of circle = " + area);
    }
}
class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.init();
        c.calc();
        c.display();
    }
}
