import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit of series : ");
        int n = sc.nextInt();
        int i=1,sum=0;
        while(i<=n){
            sum=i+sum;
            System.out.println(sum);
             i++;
        }
    }
}
/**3) WAP to find out the sum of N natural number. */