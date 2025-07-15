import java.util.Scanner;
class P1{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the breath of the rectangle : ");
        int b=sc.nextInt();
        System.out.println(" the breath of the rectangle : " +b);
        System.out.println("Enter the Area of the rectangle : ");
        int a=sc.nextInt();
        System.out.println(" the Area of the rectangle : "+a);
        int l=a/b;
        int para=2*(l+b);
        System.out.println("lenght of the rectangle : "+l);
        System.out.println("Perimeter of the rectangle : "+para);
    }
}