// WAP to check whether entered number is Armstrong or not 
import java.util.Scanner;
class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length(); // Count the number of digits

        while (n != 0) {
            int digit = n % 10; // Get the last digit
            sum += Math.pow(digit, digits); // Raise it to the power of number of digits and add to sum
            n /= 10; // Remove the last digit
        }

        if (original == sum) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}