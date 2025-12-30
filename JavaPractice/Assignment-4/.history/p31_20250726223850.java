// 9 99 999 9999     99999 .......
import java.util.Scanner;
class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        int i = 1 , num = 0; 
        while (i!=n){
            num =  num*10+9;
            System.out.print(num+" ");
            i++;
        }
        
        }
    }