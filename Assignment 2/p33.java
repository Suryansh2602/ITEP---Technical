import java.util.Scanner;

class P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Garden: ");
        int l = sc.nextInt();
        System.out.println("Enter the width of Garden: ");
        int b = sc.nextInt();
        
        int ar = l*b;
        
        System.out.println("Enter the length of Path: ");
        int pl = sc.nextInt();
        System.out.println("Enter the width of Path: ");
        int pb = sc.nextInt();

        int p_ar = (pl*l)+(b*pb) - (pl *pb);
        int used = ar - p_ar;

        System.out.println("The area of used garden :  "+used);


    }
}