//  1 + 1/2 + 1/3 + 1/4 + 1/5 ..... n terms(find out sum)

import java.util.Scanner;
 class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i=1;
        double sum=0;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        while(i <= n) {
     
            sum += 1.0/i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
