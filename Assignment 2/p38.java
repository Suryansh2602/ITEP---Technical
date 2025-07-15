import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the value of volume of cylinder : ");
        double a=sc.nextFloat();

        System.out.println("Enter the value of radius of cylinder : ");
        double r=sc.nextFloat();

        double area=2*3.14*r*r*r+(a/r);
        System.out.println("The surface area of cylinder is : "+area);
        

    }
}