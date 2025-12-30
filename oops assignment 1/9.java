
// Circle Geometry
// Create a class Circle with field radius.
// Use a setter to assign radius. Add methods to compute area and circumference.
import java.util.Scanner;

class Circle {
    private double radius;

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public double area() {
        return (3.14 * radius * radius);

    }

    public double circumference() {
        return (2 * 3.14 * radius);

    }
}

class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Scanner se = new Scanner(System.in);

        System.out.println("enter value of radius");
        c1.setRadius(se.nextDouble());
        System.out.println(c1.area());
        System.out.println(c1.circumference());

    }
}