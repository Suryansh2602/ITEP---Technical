// 9 99 999 9999     99999 .......
import java.util.Scanner;
import java.lang.Math;
class P{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        int i = 1 , num = 0; 
        while (i!=n){
            num =  (int) (num*(Math.pow(10,n))+9);
            System.out.println(num+" ");
            i++;
        }
        
        }
    }