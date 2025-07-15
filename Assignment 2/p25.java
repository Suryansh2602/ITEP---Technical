// 100 bricks of length and width are used to tile a path of a garden. What is the area of the path
import java.util.Scanner;
class P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the brick: ");
        int bl = sc.nextInt();
        System.out.println("Enter the width of the brick: ");
        int bw = sc.nextInt();
        System.out.println("Enter the Number of the brick: ");
        int n = sc.nextInt();

        int b_ar = bl*bw;
        int p_area = b_ar*n;

     System.out.println("The area of the Path is : "+p_area);     
    }
}