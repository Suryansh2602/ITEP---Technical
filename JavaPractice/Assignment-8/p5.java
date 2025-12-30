/* Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.
 */
class Circle {
    private int radius;

    //constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    //construtor
    public Circle() {
        radius = 0;
    }

    //getter
    public int getRadius() {
        return radius;
    }

    public void Area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of the Circle : " + area);
    }

    public void circumference() {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of the Circle : " + circumference);
    }

    public void Display() {
        System.out.println("The radius of the Circle : " + getRadius());
        Area();
        circumference();
    }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle(85);
        c.Display();
    }
}
