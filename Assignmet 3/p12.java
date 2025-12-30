// A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. using if else E.g.-
// INPUT : 1234        OUTPUT : 4321
// INPUT : 5982        OUTPUT : 2895 
import java.util.Scanner;
class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = sc.nextInt();
        if( number>=1000&&number<=9999 ){
            int reversedNumber = 0;
            int digit1 = number%10;
             reversedNumber = reversedNumber*10+digit1;
             number = number/10;

             int digit2 = number%10;
             reversedNumber = reversedNumber*10+digit2;
             number = number/10;

             int digit3 = number%10;
                reversedNumber = reversedNumber*10+digit3;
                number = number/10;
                
             int digit4 = number%10;
             reversedNumber = reversedNumber*10+digit4;
             System.out.println("Reversed number: " + reversedNumber);

        }else {
            System.out.println("Enter valid Number: ");
        }
    }
}