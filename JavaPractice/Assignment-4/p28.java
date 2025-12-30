// 1 2 3 4   Hello 6 7 8 9 Hello 11 12 ....
import java.util.Scanner;
class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente number of terms:");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 5 == 0) {
                System.out.print("Hello ");
            } else {
                System.out.print(i + " ");
            }
            i++;
        }
        
    }
}