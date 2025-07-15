import java.util.Scanner;
class P1{
    public static void main(String agrs[]){
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the lenght of the garden : ");
         int length = sc.nextInt();
         System.out.println("Enter the breadth of the garden : ");
         int breadth = sc.nextInt();
         int area = length * breadth ;
         System.out.println("Enter the side of square garden : ");
         int side = sc.nextInt();
         int squareArea = side * side ;
         String result=(area>squareArea)?"rectangular garden is greater":"Square garden is greater";
         System.out.println(result);

   }
}