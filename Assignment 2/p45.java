import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number of arithmatic progression: ");
        int a=sc.nextInt();

        System.out.println("Enter the second number of arithmatic progression: ");
        int b=sc.nextInt();

        System.out.println("the the term which you want to know : ");
        int an=sc.nextInt();

        int d=b-a;
        int a28=a+(an-1)*d;
        System.out.println("term you wants to know is :  "+a28);
    }
}