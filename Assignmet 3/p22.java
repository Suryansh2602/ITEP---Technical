// WAP to find greater among three number
import java.util.Scanner;
class P1 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of A: ");
        int a = sc.nextInt();
        
        System.out.println("Enter the value of B: ");
        int b = sc.nextInt();
        
        System.out.println("Enter the value of C: ");
        int c = sc.nextInt();

        if(a > 0 && b > 0 && c > 0) {
            if(a >= b && a >= c) {
                System.out.println(a + " is the greatest among " + b + " and " + c);
            } else if(b >= a && b >= c) {
                System.out.println(b + " is the greatest among " + a + " and " + c);
            } else {
                System.out.println(c + " is the greatest among " + a + " and " + b);
            }
        } else {
            System.out.println("Invalid input! Please enter positive integers.");
        }
    }
}