
//  A b C d E f G h ...... n terms
import java.util.Scanner;

class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entert the number of terms: ");
        int n = sc.nextInt();
        int i = 1;
        char ch = 'A';
        while (i <= n) {
            if (i % 2 == 0) {
                ch = Character.toLowerCase(ch);
            } else {
                ch = Character.toUpperCase(ch);
            }
            System.out.print(ch + " ");
            ch++;
            i++;
        }
        while (i <= n) {
         
        }
    }
}