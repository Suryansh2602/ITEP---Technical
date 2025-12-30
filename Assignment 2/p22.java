import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the leght of the poad : ");
        int l=sc.nextInt();
        System.out.println("Enter the width of the pond : ");
        int w=sc.nextInt();
        System.out.println("Enter the depth of the pond : ");
        int d=sc.nextInt();
        int vol=l*w*d;
        System.out.println("Capacity of the pond : "+vol);
    }
}