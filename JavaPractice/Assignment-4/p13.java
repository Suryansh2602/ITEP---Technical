// WAP to print N natural numbers in reverse order 
import java.util.Scanner;
class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Reversed  natural numbering is : ");
        int i = 1;
        while(n>=i){
            System.out.print(n+" ");
            n--;
        }

    }
}