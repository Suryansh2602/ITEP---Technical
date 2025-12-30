
// WAP to count no. Of even and odd digits in a number
import java.util.Scanner;

class P {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        int org = n;
        while (n != 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            n /= 10;
        }
        System.out.println("Original number: " + org);
        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);

    }

}
