import java.util.Scanner;
class P1{
    public static void main(String agrs[]){
        Scanner sc= new Scanner(System.in);
      
        System.out.println("Enter the value of height of trianglr : ");
        int h=sc.nextInt();
        System.out.println(" the value of base of rectangle : "+h);
        System.out.println("Enter the value of area of rectangle : ");
        int a=sc.nextInt();
        System.out.println(" the value of area of rectangle : "+a);
      int b=(a*2)/h;
        System.out.println("Base of triangle is : "+b);
    }
}