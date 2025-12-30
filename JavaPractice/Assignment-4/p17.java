// 1   2   4   7   11   16   ...... n terms

import java.util.Scanner;
class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, val=1, incr=1, i=1;
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        while(i <= n) {
            System.out.print(val + " ");
            incr++;
            val += incr - 1;
            i++;
        }
        System.out.println();
    }
}
