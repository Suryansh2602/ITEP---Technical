// Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill. 

import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = 0.0;
        System.out.println("Enter the units: ");
        int unit = sc.nextInt();

        if(unit<=50){
            bill = unit*0.50;
            System.out.println("Bill is " + bill);
            
        }else
        if(unit<=150){
            bill = (unit -50)+0.50*50*0.75;
            System.out.println("Bill is " + bill);

        }else
        if(unit<=250){
              bill = (unit -150)+100*1.20*50*0.75;
            System.out.println("Bill is " + bill);
            
        }else{
            bill = 50*0.50+100*0.75+100*1.20+(unit-250)*1.50;
            bill = bill+(bill*20)/100;
            System.out.println("Bill is " + bill);
            System.out.println();
        }

    }
}