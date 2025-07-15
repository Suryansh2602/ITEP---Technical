import java.util.Scanner;
class P1{
    public static void main(String... args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Side of cube :");
   int s1 = sc.nextInt();

   System.out.println("Enter the length of Cuboid : ");
   int l = sc.nextInt();
   System.out.println("Enter the Width of Cuboid : ");
   int b = sc.nextInt();
   System.out.println("Enter the Height of Cuboid : ");
   int h = sc.nextInt();

   int vol1 = s1*s1*s1;
   int vol = l*b*h;
   int num = vol1/vol;

   System.out.println("Number of Cuboid boxes: "+num);
    
}
}
