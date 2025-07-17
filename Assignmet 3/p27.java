
// Check given character is vowel or not using switch case 
import java.util.Scanner;

class P1 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        switch (ch) {

            case 'a' | 'A':
                System.out.println(ch + " is a vowel.");
                break;
            case 'e' | 'E':
                System.out.println(ch + " is a vowel.");
                break;
            case 'i' | 'I':
                System.out.println(ch + " is a vowel.");
                break;
            case 'o' | 'O':
                System.out.println(ch + " is a vowel.");
                break;
            case 'u' | 'U':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(+ch + " is not a vowel.");
        }
    }
}