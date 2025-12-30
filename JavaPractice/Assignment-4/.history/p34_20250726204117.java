
// WAP to check whether entered number is perfect or not
import java.util.Scanner;

class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i < n) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }

    }
}
