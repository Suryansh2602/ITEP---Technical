// WAP to check whether entered number is Armstrong or not 
import java.util.Scanner;
class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int digits = 0;
        int t = n;
        while(t!=0){
            digits++;
            t/=10;
        }

        while (n != 0) {
            int lastDigit = n % 10; 
            sum += Math.pow(lastDigit, digits); 
            n /= 10; // Remove the last digit
        }

        if (original == sum) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}