// WAP to check wheater number is positive or negative
import java.util.Scanner;
class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println(num + " is Positive");
        }else if(num == 0){
            System.out.println(num + " is neither positive nor negative");
        }else{
            System.out.println(num + " is Negative");
        }
    }
}