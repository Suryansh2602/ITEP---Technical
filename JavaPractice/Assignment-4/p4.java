import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int fact=1;
        int i=1;
        while( i<=n){
            fact=fact*i;
            System.out.println("factorial : "+fact);
            i++;
        }
       
    }
}
/**4) WAP to print table of a number */