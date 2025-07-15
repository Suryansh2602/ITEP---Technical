import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

         System.out.println("Enter the value of radius of cylinder : ");
        double r=sc.nextFloat();

        System.out.println("Enter the value of height of cylinder : ");
        double h=sc.nextFloat();

        double vol=3.14*r*r*h;
        System.out.println("The volume of cylinder is : "+vol);

    }
}