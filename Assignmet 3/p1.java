import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int l = sc. nextInt();
        System.out.println("Enter the width : ");
        int w = sc.nextInt();
        if (l == w){
            System.out.println("It is a Square");
        }else{
            System.out.println("It is the not square ");
        }


    }
}