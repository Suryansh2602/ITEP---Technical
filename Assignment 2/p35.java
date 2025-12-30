import java.util.Scanner;
class P1{
    public static void main(String... args){
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the value of radius of cylinder : ");
        float r=sc.nextFloat();
        
        System.out.println("Enter the value of height of cylinder : ");
        float h=sc.nextFloat();
        
        double area=2*3.14*r*(r+h);
        System.out.println("area of the cylinder : "+area);
    }
    
}