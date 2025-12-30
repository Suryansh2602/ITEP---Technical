import java.util.Scanner;
public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of pattern length: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) System.out.print("* ");
            else System.out.print("# ");
            i++;
        }
        System.out.println();
    }
}
