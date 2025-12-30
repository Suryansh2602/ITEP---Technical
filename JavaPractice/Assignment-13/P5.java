
// WAP to enter mobile of user and check wheter it is valid or invalid.
//    [length must be 10, all letter must be digit]
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        String mobile = sc.nextLine();
        if (isValidNumber(mobile)) {
            System.out.println("Valid Number ");
        } else {
            System.out.println("Invalid Number ");
        }
    }

    public static boolean isValidNumber(String number) {
        return number != null && number.length() == 10 && number.matches("\\d{10}");
    }
}