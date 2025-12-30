// WAP to find out LCM of a number
import java.util.Scanner;
class P {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), max = 0;
        int lcm = 0;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        while (true) {
            if (max % x == 0 && max % y == 0) {
                lcm = max;
                break;
            }
            max++;

        }
        System.out.println("LCM is: " + lcm);

    }
}