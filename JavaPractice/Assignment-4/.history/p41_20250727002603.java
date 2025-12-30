// WAP to find out LCM of a number
import java.util.Scanner;
class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = (a > b) ? a : b; // Start with the larger number
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
                break; // Exit the loop when LCM is found
            }
            lcm++; // Increment LCM candidate
        }
    }}
        