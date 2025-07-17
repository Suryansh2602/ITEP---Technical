// WAP to calculate area of circle 
import java.util.Scanner;
import java.lang.Math;
class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        
        if (radius > 0) {
            double area = Math.PI * radius * radius;
            System.out.println("Area of the circle is : "+area);
        }else{
            
            System.out.println("Please enter valid radius.");
    }
} 
}

