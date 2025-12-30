// WAP to find lowest number among four different number 
import java.util.Scanner;
class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");   
        int num3 = sc.nextInt();
        System.out.print("Enter fourth number: ");
        int num4 = sc.nextInt();
        int lowest = 0;
        if (num1 <= num2 && num1 <= num3 && num1 <= num4) {
            lowest = num1;
        } else if (num2 <= num1 && num2 <= num3 && num2 <= num4) {
            lowest = num2;
        } else if (num3 <= num1 && num3 <= num2 && num3 <= num4) {
            lowest = num3;
        } else if (num4 <=num1 && num4 <= num2 && num4 <= num3) {
            
            lowest = num4;
        }else {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
        System.out.println("Lowest number is: " + lowest);
    }
}