// How many bricks will be required to lay a path 120 m long and 2.4m breadth if a brick is 24 cm long and 15cm wide

import java.util.Scanner;
class P1{
    public static void main(String... args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of Path in cms : ");
        double pl = sc.nextInt();
        
        System.out.println("Enter the Width of Path in cms : ");
        double pw = sc.nextInt();

        System.out.println("Enter the Length of Brick in cms : ");
        double bl = sc.nextInt();

        System.out.println("Enter the Width of Brick in cms : ");
        double bw = sc.nextInt();

        double ap = pl*pw;
        double ab = bl*bw;

        int num = (int)(ap/ab);

        System.out.println("The number of bricks required : "+num);


    }
}