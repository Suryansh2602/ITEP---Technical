// 0 8 64 216 ............ 
import java.util.Scanner;
class P{
    public static void main(String... args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the term: ");
int n = sc.nextInt(), i= 0, sq = 2;
while(i<=n){
    sq = i*i*i;
    System.out.print(sq+" ");
    i+=2;
}

    }
}