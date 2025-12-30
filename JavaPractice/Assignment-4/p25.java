// 1 27 125 343 ............
import java.util.Scanner;
import java.lang.Math;
 class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i=1;
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        while(i <= n) {
            System.out.print((int)Math.pow(i*2-1, 3) + " ");
            i++;
        }
        System.out.println();
    }
 }