import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
      
        System.out.println("Enter the value of lenght of plot : ");
        int l=sc.nextInt();
        System.out.println(" the value of lenght of plot : "+l);
        System.out.println("Enter the value of breath of plot : ");
        int b=sc.nextInt();
        System.out.println(" the value of breath of plot : "+b);
        int area=l*b;
        int price=area/100*6;
        System.out.println("Price of total tileing : "+price);
    }
}