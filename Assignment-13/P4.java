
/* 4. WAP To enter name of user and check whether it valid name or not.*/
import java.util.Scanner;

class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        if (isValidName(sc.nextLine()))
            System.out.println("Valid name ");
        else
            System.out.println(" Invalid name ");
        sc.close();
    }

public static boolean isValidName(String name){
            return name != null && !name.trim().isEmpty() && name.matches("[a-zA-Z\\s]+");

}

}