import java.util.Scanner;
class P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter worked years : ");
        int years = sc.nextInt();
         
     if(years>5){
         double bonus = (double) ((salary/100)*5);
         double  netSalary = (double)(salary + bonus);
         System.out.println("Your salary is : "+netSalary);
     }
    else{
        System.out.println("your Salary is : "+ salary);
     }

    }
}