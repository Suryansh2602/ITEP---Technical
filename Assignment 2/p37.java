import java.util.Scanner;
import java.lang.Math;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the value of area of cylinder : ");
        float a=sc.nextFloat();

        System.out.println("Enter the value of height of cylinder : ");
        float h=sc.nextFloat();
        
        double d=2*((1/2)*Math.sqrt((h*h)+2*(a/3.14)));
        System.out.println("diameterr of the cylinder : "+d);
    }
}