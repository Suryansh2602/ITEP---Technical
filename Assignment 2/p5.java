import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lenght of the park : ");
        int l=sc.nextInt();
        System.out.println(" the lenght of the park : "+l);
        System.out.println("Enter the cost of fiencing : ");
        int cost=sc.nextInt();
        System.out.println(" the cost of fiencing : "+cost);
        int para=cost/25;
        int b=(para/2)-l;
        int area=l*b;
        System.out.println("Breath of the park : "+b);
        System.out.println("Perimeter of the park: "+para);
        System.out.println("Area of the park : "+area);

        

    }
}