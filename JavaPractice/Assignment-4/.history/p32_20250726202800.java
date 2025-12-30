//  A b C d E f G h ...... n terms
import java.util.Scanner;
class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entert the number of terms: ");
        int n = sc.nextInt();
        int i = 1;
        char ch = 'A';
        char ch1 = 'a';
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.print(ch1 + " ");
                ch++;
            } else {
                System.out.print(ch + " ");
                ch1++;
            }
            i++;
        }
     

    }
}