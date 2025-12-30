
// 8. Write a Java program to test if a given string contains the specified sequence of char values
import java.util.Scanner;

class Main {
    public static void main(String... args) {

        String a = "Hello Everyone I am a begginer java Practitioner";
        String arr[] = a.split(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String b = sc.next();
        int i = 0;
        boolean j = false;
        for (i = 0; i < arr.length; i++) {
            if (b.equlals(i)){
            break;}
            else
            System.out.println("Not found");
        }
    }
}