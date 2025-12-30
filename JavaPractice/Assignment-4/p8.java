/**8) WAP to print Fibonacci series */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of term : ");
        int n=sc.nextInt();
        int i = 0,a = 1, count=0;;
        while(i<=n){
        System.out.println(count);
        
        count = i+a;
        i=a;
        a=count;
        }
    }
}