import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the floor lenght in meter : ");
        int bl=sc.nextInt();
        System.out.println(" the floor lenght in meter : "+bl);
        System.out.println("Enter the floor breath in meter : ");
        int bb=sc.nextInt();
        System.out.println(" the floor breath in meter : "+bb);
        int ba=bb*bl;
        System.out.println("Enter the tile lenght in meter : ");
        int tl=sc.nextInt();
        System.out.println(" the tile lenght in meter : "+tl);
        System.out.println("Enter the tile breath in meter : ");
        int tb=sc.nextInt();
        System.out.println(" the tile breath in meter : "+tb);
        int ta=tl*tb;
        int tileNo=ba/ta;
        System.out.println("number of tiles : "+tileNo);
    }
}