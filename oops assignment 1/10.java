// Rectangle Area Calculator
// Create a class Rectangle with fields: length, width.
// Use setters to assign values. Add a method to calculate area.

import java.util.Scanner;

class Rectangle {
    private double length, width;

    public void setLength(double l) {

        this.length = l;
    }

    public void setWidth(double w) {

        this.width = w;
    }

    public double area() {
        return length * width;
    }

}

class TestMain {
    public static void main(String[] args) {
        Rectangle c1 = new Rectangle();
        Scanner se = new Scanner(System.in);

        System.out.println("Enter value of Length ");
        c1.setLength(se.nextDouble());
        System.out.println("Enter value of Width ");
        c1.setWidth(se.nextDouble());
        System.out.println(c1.area());

    }
}