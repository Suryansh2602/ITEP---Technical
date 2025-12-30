/**10) WAP to print even upto N. */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of terms : ");
        int n = sc.nextInt();
        int i=0;
        while(i<=n){
            System.out.println("Even : "+i);
            i+=2;

        }
    }
}