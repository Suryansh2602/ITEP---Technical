// WAP to check given year is a leap year or not 
import java.util.Scanner;
class P1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if(year < 0) {
            System.out.println("Please enter a valid year.");
            return;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
