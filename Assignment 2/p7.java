import java.util.Scanner;
class P1{
    public static void main(String agrs[]){
        Scanner sc= new Scanner(System.in);
      
        System.out.println("Enter the value of base of trianglr : ");
        int b=sc.nextInt();
        System.out.println(" the value of base of rectangle : "+b);
        System.out.println("Enter the value of area of rectangle : ");
        int a=sc.nextInt();
        System.out.println(" the value of area of rectangle : "+a);
      int h=(a*2)/b;
        System.out.println("Height of triangle is : "+h);
    }
}