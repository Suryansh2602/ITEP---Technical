
// WAP to check wheather number is even or odd
import java.util.Scanner;
class P1{
    public static void main(String... args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num %2 ==0){
            System.out.println(num + " is Even");

        }else{
            System.out.println(num + " is Odd");
        }
    }
}