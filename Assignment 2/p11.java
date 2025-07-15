import java.util.Scanner;
class P1{
    public static void main(String agrs[]){
        int a;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter height of a triangle are in the ratio : ");
        int h=sc.nextInt();
        System.out.println("height of a triangle are in the ratio : "+h);
        System.out.println("Enter base of a triangle are in the ratio : ");
        int b=sc.nextInt();
        System.out.println("base of a triangle are in the ratio : "+b);
        System.out.println("Enter the area of the triangle : ");
        int area=sc.nextInt();
        System.out.println("Area of the triangle : "+area);
         a =area*(2/h)*b;
        System.out.println("Height of the triangle : "+h);
        System.out.println("Base of the triangle : "+b);
    }
}
