// WAP to print Alphabets in reversing order.
import java.util.Scanner;
class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       char ch = 'Z';
       System.out.println("Enter the number of terms: ");
       int n = sc.nextInt();
       int i = 1;
       while(i!=n){
        System.out.println(ch + " ");
        ch--;
        i++;
       }
    }
}