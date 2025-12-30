// WAP to exchange value to two variable with third variable and without third variable

import java.util.Scanner;
class P1{
public static void main(String... args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the integer value of a : ");
int a = sc.nextInt();
System.out.println("Enter the integer value of b : ");
int b = sc.nextInt();

System.out.println("The valur of 'a' is : "+a+" and the value of 'b' "+b+" before swapping");

int c = a;
a = b;
b = c;
c = a;
System.out.println("The valur of 'a' is : "+a+" and the value of 'b' "+b+" after swapping using third variable ");
}
}