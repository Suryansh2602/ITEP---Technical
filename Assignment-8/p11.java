//  Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.

class Employee {
    private String name;
    private int salary;
    private int hireDate, hire_month, hire_year, current_date, current_month, current_year, total_year;

    public Employee(String name, int salary, int hireDate, int hire_month, int hire_year) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public void current_date(int current_date, int current_month, int current_year) {
        this.current_date = current_date;
        this.current_month = current_month;
        this.current_year = current_year;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void service(int hire_year, int current_year) {
        this.total_year = current_year - hire_year;

    }

    public void display() {
        System.out.println("Total Years of service : " + this.total_year);
    }
}

class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Saneha Chimote", 20000, 12, 8, 2004);
        emp.current_date(12, 8, 2025);
        emp.service(2004, 2025);
        emp.display();

    }
}