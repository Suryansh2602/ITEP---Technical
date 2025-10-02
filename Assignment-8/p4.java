/*. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle. */
class Rectangle {
    private int width;
    private int height;

    //constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //constructor
    public Rectangle() {
        width = height = 0;
    }

    //getter
    public int getHeight() {
        return height;
    }

    //getter
    public int getWidth() {
        return width;
    }

    //area
    public void Area() {
        int area = this.height * this.width;
        System.out.println("Area of the Rectangle is : " + area);
    }

    //perimeter
    public void Perimeter() {
        int perimeter = 2 * (this.height + this.width);
        System.out.println("Perimeter of the Rectangle : " + perimeter);
    }

    //display
    public void Display() {
        System.out.println("The Width of the Rectangle is : " + getWidth());
        System.out.println("The Height of the Rectangle is : " + getHeight());
        Area();
        Perimeter();
    }

}

class Main {
    public static void main(String[] args) {
        Rectangle rg = new Rectangle(15, 48);
        rg.Display();
    }
}
