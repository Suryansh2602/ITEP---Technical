import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        int n = sc.nextInt();
        int i=1;
        while(n%i==0){
            System.out.println(i);
            i++;
        }
    }
}
/**6) WAP to find out the factors of a number. */