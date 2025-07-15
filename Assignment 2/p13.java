import java.util.Scanner;

class P1{
    public static void main(String agrs[]){
        Scanner sc= new Scanner(System.in);
      
        System.out.println("Enter the value of 1 side of triangle : ");
        int s1=sc.nextInt();
        System.out.println(" the value of 1 side of triangle : "+s1);
        System.out.println("Enter the area of triangle : ");
        int a=sc.nextInt();
        System.out.println(" the area of triangle : "+a);
       int s2=(a*2)/s1;
        System.out.println("the value of 2 side of triangle: "+s2);
    }
}