
//  ...... -6 -3 0 3 6 9 ....... n terms
// 16) ...... -6 -3 0 3 6 9 ....... n terms
import java.util.Scanner;

class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int i = -n;
        while (i <= n) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}
