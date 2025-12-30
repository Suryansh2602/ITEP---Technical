// 1 8 27 64 125 .....
import java.util.Scanner;
class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n  = sc.nextInt();
        int i = 0 ;
        while(i <= n){
            System.out.print(i*i*i+" ");
            i++;
        }
    }
} 