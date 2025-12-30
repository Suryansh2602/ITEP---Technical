// WAP to find greater among two number 
import java.util.Scanner;
class P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value(A): ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Value(b):");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a + "A is greater than "+b);
        }else if(b >  a){
            System.out.println(b + " B is greater than "+a);
        }else if(a==b){
        System.out.println("Both are equal...");
        }else{
            System.out.println("Invalid input! enter valid integers.");
        }

    }
}