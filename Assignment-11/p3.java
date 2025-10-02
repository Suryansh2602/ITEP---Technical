// Problem 2: Employee Management System 
// Abstract class Employee:
// id, name, salary fields
// abstract method calculateSalary()
// concrete method showDetails()
// Subclasses:

// FullTimeEmployee (salary = fixed monthly)

// PartTimeEmployee (salary = hourly * rate)

// Intern (stipend based)

// Interface BonusEligible with method giveBonus().

// Only FullTimeEmployee and PartTimeEmployee should implement BonusEligible.

// In main class, create employees and calculate salary + bonus.

import java.util.Scanner;

abstract class Employee {
    private int id, salary;
    private String name;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    abstract void calculateSalary();

    public void showDetails() {
        System.out.println(" Id : " + id + " Name : " + name + "Salary : " + salary);
    }

}

interface BonusEligible {
    void giveBonus();
}

class FullTimeEmployee extends Employee implements BonusEligible {
    Scanner sc = new Scanner(System.in);
    private int bonus;

    public FullTimeEmployee(int id, String name) {
        super(id, name, 10000);

    }

    public void calculateSalary() {
        setSalary(getSalary() + bonus);
        System.out.println("Salary : " + getSalary());
    }

    public void giveBonus() {
        System.out.println("Enter the bonus for Full time Employee: " + getName());
        bonus = sc.nextInt();

    }

}

class PartTimeEmployee extends Employee implements BonusEligible {
    Scanner sc = new Scanner(System.in);
    private int bonus;

    public PartTimeEmployee(int id, String name, int hours) {
        super(id, name, 200*hours);

    }

    public void calculateSalary() {
        setSalary(getSalary() + bonus);
        System.out.println("Salary : " + getSalary());
    }

    public void giveBonus() {
        System.out.println("Enter the bonus for Part time Employee: " + getName());
        bonus = sc.nextInt();

    }

}

class Intern extends Employee {

    public Intern(int id, String name, int salary) {
        super(id, name, salary);

    }

    public void calculateSalary() {
        System.out.println("Stipend of " + getName() + " With Id: " + getId() + " is : " + getSalary());
    }

}

class Main {
    public static void main(String[] args) {
        Employee a = new FullTimeEmployee(1, "A");
        a.showDetails();

        ((BonusEligible) a).giveBonus();
        a.showDetails();

        Employee b = new PartTimeEmployee(2, "B", 6);
        b.showDetails();

        ((BonusEligible) b).giveBonus();
        b.showDetails();
        Employee c = new Intern(3, "Intern", 100);
        c.showDetails();
        c.showDetails();

    }
}