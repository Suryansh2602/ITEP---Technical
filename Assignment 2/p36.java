import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the value of diameter of cylinder : ");
        float d=sc.nextFloat();

        System.out.println("Enter the value of height of cylinder : ");
        float h=sc.nextFloat();

        double area=2*3.14*(d/2)*((d/2)+h);
        System.out.println("area of the cylinder : "+area);
    }
}