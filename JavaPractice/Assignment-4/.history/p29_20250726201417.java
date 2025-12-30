// 1 11 111 1111     11111 ......
import java.util.Scanner;
class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        int i = 1 , num = 0;
        while (i<=n){
            num =  num*10+1;
            System.out.print(num+" ");
            i++;
        }
    }

}