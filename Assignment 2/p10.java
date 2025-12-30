import java.util.Scanner;
class P1{
    public static void main(String agrs[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter isosceles right angled triangle side : ");
        int l=sc.nextInt();
        System.out.println("isosceles right angled triangle side :  "+l);
        float area=(l*l)/2f;
        System.out.println("isosceles right angled triangle area : "+area);
    }
}