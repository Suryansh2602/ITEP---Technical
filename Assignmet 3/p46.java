// public Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.

import java.util.Scanner;
 class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter choice \n '+' for addition \n '>' for greaterst \n '==' for equal");
        String choice = sc.next();
        if(choice.equals("+")) {
            System.out.println("Addition of two number is "+(a+b));
            }
        else if(choice.equals(">")) {
                if(a>b) {
                    System.out.println(a+" is greater than "+b);
                    }
                else {
                        System.out.println(b+" is greater than "+a);
                        }
                        }
        else if(choice.equals("==")) {
            if(a==b) {
            System.out.println("Both number are equal");
            }
            else {
              System.out.println("Both number are not equal");
              }
              }
              }
                                    
 }