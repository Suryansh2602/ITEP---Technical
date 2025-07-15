import java.util.Scanner;
class P1{
    public static void main(String agrs[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("lenght of a garden: ");
        int l = sc.nextInt();
        System.out.println("breath of a garden : ");
        int b=sc.nextInt();
        int daycount=10*(2*(l+b));
        System.out.println("Distance covered in a day : "+daycount);


    }
}