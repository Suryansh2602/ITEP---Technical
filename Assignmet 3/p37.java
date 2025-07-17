// Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. 

import java.util.Scanner;
class P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first angle: ");
        int angle1 = sc.nextInt();
        
          
        System.out.print("Enter the second angle: ");
        int angle2 = sc.nextInt();

        System.out.print("Enter the third angle: ");
        int angle3 = sc.nextInt();

        int sumOfAngles = angle1 + angle2 + angle3;
        if ( sumOfAngles== 180) {
            System.out.println("The triangle is valid.");
        } else if (sumOfAngles != 180) {
            System.out.println("The triangle is not valid.");
            
        }else{
            System.out.println("The Input is not valid.");
        }
    }
}