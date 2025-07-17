// public W.A.P to check the sign of given number  
    
import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double n = sc.nextInt();

        if(n<0){
            System.out.println("It has negativev sign");
        }else{
            System.out.println("It has positive sign");
        }
    }
}