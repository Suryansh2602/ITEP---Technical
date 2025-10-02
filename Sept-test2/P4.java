//  Method Overloading Problem
//  Problem: Area Calculator
// Create a class AreaCalculator with overloaded methods:
// calculateArea(int side) → returns the area of a square.
// calculateArea(int length, int breadth) → returns the area of a rectangle.
// calculateArea(double radius) → returns the area of a circle.
// In main(), demonstrate all three methods.

import java.util.Scanner;

class Main {

    public static double calculateArea(int side) {
        return side * side;
    }

    public static double calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Square : ");
        int side = sc.nextInt();
        double area = calculateArea(side);
        System.out.println("Area of Square : " + area);

        System.out.println("Enter the Length of Rectangle : ");
        int length = sc.nextInt();
        System.out.println("Enter the Breadth of Rectangle : ");
        int breadth = sc.nextInt();
        area = calculateArea(length, breadth);
        System.out.println("Area of Rectangle : " + area);

        System.out.println("Enter the Radius of Circle: ");
        double radius = sc.nextDouble();
        area = calculateArea(radius);
        System.out.println("Area of Circle is : " + area);
    }
}
