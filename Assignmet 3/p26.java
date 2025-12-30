
// Find even odd using switch case 
import java.util.Scanner;

class P1 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        switch (n % 2) {
            case 0:
            System.out.println("EVEN");
            break;
            case 1:
            System.out.println("ODD");
            break;
            default: 
            System.out.println("Invalid input");

        }
    }
}
