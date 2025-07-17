//  W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. 

import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'c' to convert Fahrenheit to Celsius or 'f' to convert Celsius to Fahrenheit:");  
        char choice = sc.next().charAt(0);
        switch (choice) {
            case 'c'| 'C':
                System.out.println("Enter temperature in Fahrenheit:");
                double fahrenheit = sc.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + celsius);
                
                break;
            case 'f'| 'F':
                System.out.println("Enter temperature in Celsius:");
                double celsiusInput = sc.nextDouble();
                double fahrenheitOutput = (celsiusInput * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheitOutput);
        
            default:
                break;
        }
    }
}