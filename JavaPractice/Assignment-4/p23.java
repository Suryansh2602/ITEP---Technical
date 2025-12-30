// 1 9 25 49 81 .....
import java.util.Scanner;
class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n  = sc.nextInt();
        int i = 1 ;
        while(i <= n){
            System.out.print(i*i+" ");
            i +=2;
        }
    }
} 