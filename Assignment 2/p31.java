// what will be the area of a square with perimeter 200 m 

import java.util.Scanner;

class P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Perimeter of Square: ");
       int p = sc.nextInt();
       double s = p/4;
       double ar = s*s;
System.out.println("The Area of the square is : "+ar);

    }
}