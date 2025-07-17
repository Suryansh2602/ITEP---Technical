// Write a Java program to count total number of notes in given amount using if else if else.
import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = sc.nextInt();
        int fivehundred=0,hundred = 0, fifty = 0, twenty = 0, ten =0;
        if(amount >=500)
        fivehundred = amount / 100;
        amount = amount % 100;
        if(amount >= 100)
        hundred = amount / 100;
        amount = amount % 100;
        if(amount >= 50)
        fifty = amount / 50;
        amount = amount % 50;
        if(amount >= 20)
        twenty = amount / 20;
        amount = amount % 20;
        if(amount >= 10)
        ten = amount / 10;
        amount = amount % 10;
       
        System.out.println("Number of five hundred notes  : "+fivehundred);
        System.out.println("Number of hundred notes: "+ hundred);
        System.out.println("Number of fifty notes: "+ fifty);
        System.out.println("Number of twenty notes: "+ twenty);
        System.out.println("Number of ten notes: "+ ten);
        
    }

        
        
}