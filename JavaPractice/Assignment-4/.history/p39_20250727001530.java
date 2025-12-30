// WAP to check whether entered number is strong or not
import java.util.Scanner;
class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            n /= 10;
        }

        if (original == sum) {
            System.out.println(original + " is a strong number.");
        } else {
            System.out.println(original + " is not a strong number.");
        }
    }
}