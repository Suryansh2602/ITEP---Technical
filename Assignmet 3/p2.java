// A shop will give discount of 10% if the cost of purchased quantity is more than 1000. 
// ask user for quantity suppose, one unit will cost 100. 
// judge and print total cost for user

import java.util.Scanner;
class P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity: ");
        int quant = sc.nextInt();
         int price = quant*100;
     if(price>1000){
         int discount = price*(10/100);
         int cost = price - discount;
         System.out.println("Your bill is : "+cost);
     }
    else{
        System.out.println("cost " +price);
     }

    }
}