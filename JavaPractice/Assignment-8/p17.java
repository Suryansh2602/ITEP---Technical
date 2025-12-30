//Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".

abstract class Shape {

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override area method
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Override perimeter method
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override area method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Override perimeter method
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double side1, side2, side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Calculate area using Heron's formula
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Override perimeter method
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("\nCircle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nTriangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
