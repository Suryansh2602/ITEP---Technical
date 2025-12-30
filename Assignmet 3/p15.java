// Write a java program to accept the cost price of a bike
//     and display the road tax to be paid according to the 
//     following criteria.
//     Cost Price(In Rs)		Tax
//      > 100000			 15%
//      >50000 and <=100000	 10%
//      <=50000			 5%			

import java.util.Scanner;
class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price of the bike: ");
        double costPrice = sc.nextDouble();

       if (costPrice <=0){
        System.out.println("Enter a valid cost price.");
       }else if(costPrice > 100000){
        double tax = costPrice*(15.0/100);
        System.out.println(("tax is " + tax));
       }else if (costPrice > 50000 && costPrice <= 100000){
        double tax = costPrice *(10.0/100);
        System.out.println(("tax is " + tax));
       }else if (costPrice <= 50000){
        double tax = costPrice *(5.0/100);
        System.out.println(("tax is " + tax));
       }else{
        System.out.println("Invalid Input");
       }
    }
}