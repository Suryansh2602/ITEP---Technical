import java.util.Scanner;

public class StarHashPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int i = 0;  // counter
        int spaces = 0;  // initial number of spaces between * and #

        while (i < n) {
            System.out.print("*");

            // print spaces using a nested loop
            int j = 0;
            while (j < spaces) {
                System.out.print(" ");
                j++;
            }

            System.out.println("#");

            // increment spaces for next line: +1 for first time, then +2
            if (i == 0) {
                spaces = 1;
            } else {
                spaces += 2;
            }

            i++;
        }
    }
}
