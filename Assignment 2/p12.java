import java.util.Scanner;
import java.lang.Math;
class P1{
    public static void main(String agrs[]){
        Scanner sc= new Scanner(System.in);
      
        System.out.println("Enter the value of 1 side of triangle : ");
        int s1=sc.nextInt();
        System.out.println(" the value of 1 side of triangle : "+s1);
        System.out.println("Enter the value of 2 side of triangle : ");
        int s2=sc.nextInt();
        System.out.println(" the value of 2 side of triangle : "+s2);
       double s3=Math.sqrt((s1*s1)-(s2*s2));
        System.out.println("the value of 3 side of triangle: "+s3);
    }
}