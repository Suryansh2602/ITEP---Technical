import java.util.Scanner;
class P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 bases of trapezoid: ");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        
        System.out.println("Enter the Height of trapezoid: ");
        int h = sc.nextInt();

        double ar = (a1+a2)*h/2;
        System.out.println("The area of the walk way : "+ar);
        

    }
}
