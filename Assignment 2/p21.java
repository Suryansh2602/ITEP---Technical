import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the wall lenght in meter : ");
        int bl=sc.nextInt();
        System.out.println(" the wall lenght in meter : "+bl);
        System.out.println("Enter the wall breath in meter : ");
        int bb=sc.nextInt();
        System.out.println(" the floor wall in meter : "+bb);
        System.out.println("Enter the height of the wall in meter : ");
        int bh=sc.nextInt();
        int ba=bb*bl*bh;
        System.out.println("Enter the brick lenght in meter : ");
        int tl=sc.nextInt();
        System.out.println(" the brick lenght in meter : "+tl);
        System.out.println("Enter the brick breath in meter : ");
        int tb=sc.nextInt();
        System.out.println(" the brick breath in meter : "+tb);
        System.out.println(" Enter the brick height in meter : ");
        int th=sc.nextInt();

        int ta=tl*tb*th;
        int brickNo=ba/ta;
        System.out.println("number of bricks : "+brickNo);
    }
}