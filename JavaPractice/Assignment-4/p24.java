// 0 4 16 36 64 ..... 1 2 3 4 5 6 7 8
import java.util.Scanner;
class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n  = sc.nextInt();
        int i = 0 ;
        while(i <= n){
            System.out.print(i*i+" ");
            i +=2;
        }
    }
} 