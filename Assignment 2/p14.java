import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the diagonal of a field in the form of a quadrilaterale : ");
        int d1 = sc.nextInt();
        System.out.println(" the diagonal of a field in the form of a quadrilaterale : "+d1);
        System.out.println("perpendicular distance of the other two vertices from the diagonal  : ");
        int p1= sc.nextInt();
        int p2= sc.nextInt();
         System.out.println("perpendicular distance of the other two vertices from the diagonal  : "+p1);
        System.out.println("perpendicular distance of the other two vertices from the diagonal  : "+p2);
        int area=(d1*(p1+p2))/2;
        System.out.println("Area of the quadrilateral is : "+area);


    }
}