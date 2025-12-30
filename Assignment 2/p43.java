import java.util.Scanner;
import java.lang.Math;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value of slate height of cone : ");
        double sl=sc.nextFloat();

        System.out.println("Enter the value of height of cone : ");
        double h=sc.nextFloat();

        double r=Math.sqrt(h*h-sl*sl);
        double cost=3.14*r*r*10;
        System.out.println("cost of polishing the cone : "+cost);

    }
}