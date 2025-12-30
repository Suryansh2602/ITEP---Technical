// how many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm and 400 cm
import java.util.Scanner;

class P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length tile in cms : ");
        int s1 = sc.nextInt();

        System.out.println("Enter the width tile in cms : ");
        int s2 = sc.nextInt();
        
        System.out.println("Enter the length of floor in cms : ");
        int l = sc.nextInt();
        
        System.out.println("Enter the width of floor in cms : ");
        int w = sc.nextInt();

        int a1 = s1*s2;
        int a2 = l*w;

        int t = a2/a1;
        System.out.println("The Total number of tiles : "+t);

    }
}