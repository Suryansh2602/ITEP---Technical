// WAP to calculate area of rectangle
import java.util.Scanner;
class P1 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length : ");
        double length = sc.nextDouble();
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        double area = length *width;
        System.out.println("Area of rectangle is: " + area);

    }
}