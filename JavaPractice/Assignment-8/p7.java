/* Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
 */
import java.util.Scanner;
class Employee {
    private String name;
    private String jobTitle;
    private int salary;

    //constructor
    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    //default construtor
    public Employee() {
        name = jobTitle = null;
        salary = 0;
    }

    //getter
    public String getName() {
        return name;
    }

    //getter
    public String getJobTitle() {
        return jobTitle;
    }

    //getter
    public int getSalary() {
        return salary;
    }

    //setter
    public void setSalary(int salary){
        this.salary = salary;
    }

    public void UpdatedSalary() {
        System.out.println("Updated salary");
        display();
    }

    public void display() {
        System.out.println("Name of the Employee : " + getName());
        System.out.println("Job of the Employee : " + getJobTitle());
        System.out.println("Updated Salary of Employee : " + getSalary() );
    }
}

class Main {
    
    public static void main(String[] args) {
        
    
    Employee e = new Employee("Satara", "software developer", 30000);
    e.setSalary(50000);
    e.display();
     }
}