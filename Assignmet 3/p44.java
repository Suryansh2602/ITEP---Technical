// Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% 
// Basic salary <= 20000 : hra = 25%, DA = 90% 
// Basic salary > 20000 : hra = 30%, DA = 95%
import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Salary: ");
        double salary = sc.nextDouble();

        double hra=0, da=0, gs;
        
        if(salary <= 10000){
            hra = (20/100)*salary;

         da = (80/100)*salary;

        }else if(salary <= 20000){
            hra = (25/100)*salary;

         da = (90/100)*salary;

        }else if(salary > 20000){
            hra = (30/100)*salary;

         da = (95/100)*salary;

        }else{
            System.out.println("Something went wrong");
        }

        gs = salary+hra+da;

System.out.println("Gross Salary : "+gs);

    }
}