// How many square tiles of side 10cm will be required to tile a floor  measureing 800 cm by 900 cm
import java.util.Scanner;

class P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Squared tile in cms : ");
        int s = sc.nextInt();
        
        System.out.println("Enter the length of floor in cms : ");
        int l = sc.nextInt();
        
        System.out.println("Enter the width of floor in cms : ");
        int w = sc.nextInt();

        int a1 = s*s;
        int a2 = l*w;

        int t = a2/a1;
        System.out.println("The Total number of tiles : "+t);

    }
}
