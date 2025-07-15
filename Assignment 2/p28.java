// A carpet is 5m ling
import java.util.Scanner;
class P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of dining room in m : ");
        int l = sc.nextInt();
        
        System.out.println("Enter the Width of dining room in m : ");
        int w = sc.nextInt();

        System.out.println("Enter the Rate of tiling per square m :  ");
        int r = sc.nextInt();

        int ar = l*w;
        System.out.println("The Total area will be : "+ ar + " m^3");

        int price = ar*r;
        System.out.println("The total price of Carpet is : "+price);
    }
}