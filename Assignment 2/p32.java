// A square garden with a side length of 150 m has a square swimming pool in the very centre with a side length of 25m. Calculate the area of garden 

import java.util.Scanner;
class P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Swimming pool: ");
        int l1 = sc.nextInt();
        int a = l1*l1;
        
        System.out.println("Enter the Length of the Garden: ");
        int l2 = sc.nextInt();
        int b = l2*l2;
     
        int remain =a -b ;
        System.out.println("The area of the Garden is : "+remain);
        
    }
}