// W.A.P to check whether given number is even or odd Without using % operator. 
import java.util.Scanner;
class P34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if ((num & 1) == 0) {//if last bit is 0 then number is even
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}

