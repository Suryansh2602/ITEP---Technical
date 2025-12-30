/**9) WAP to print N even numbers. */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms  : ");
        int n=sc.nextInt();
        int i=0;
        while(i<=n){
            System.out.println("Even number is :  "+i);
            i+=2;
        }
    }
}