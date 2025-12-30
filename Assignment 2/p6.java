import java.util.Scanner;
import java.lang.Math;
class P1{
    public static void main(String agrs[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the side 1 of triangle : ");
        int s1=sc.nextInt();
        System.out.println(" the side 1 of triangle : "+s1);
        System.out.println("Enter the side 2 of triangle : ");
        int s2=sc.nextInt();
        System.out.println(" the side 2 of triangle : "+s2);
        System.out.println("Enter the perimeter of triangle : ");
        int p=sc.nextInt();
        System.out.println(" the perimeter of triangle : "+p);
        int s3=p-(s1+s2);
        int s=(s1+s2+s3)/2;
        double area=Math.sqrt(s*((s-s1)*(s-s2)*(s-s3)));
        System.out.println("Area of the triangle : "+area);


    }
}