import java.util.Scanner;
import java.lang.Math;
class P1{
    public static void main(String agrs[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the side of equilateral triangle : ");
        int a=sc.nextInt();
        System.out.println(" the side of equilateral triangle : "+a);
        float area=(float)(Math.sqrt(3f)/4f)*a*a*a;
        System.out.println("Area of the equilateral triangle : "+area);
    }
}