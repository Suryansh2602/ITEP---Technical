// *# * # * # * # * ....... 
import java.util.Scanner;
class P{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter term: ");
    int n = sc.nextInt();
    int i = 1;
    String s = " ";
    while(i<=n){
System.out.println("*"+s*i+"#");
i++;
    }
}
}
