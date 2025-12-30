//  Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
// Only parameterized constructor;
// totalSalary always represent total of all the salaries of all employees created.
// empNo should be auto incremented.
// display total employees and totalSalary using class method.

class Employee {
    private int empNo;
    private double salary;
    private static double totalSalary = 0.0;
    private static int totalEmployees = 0;
    private static int empCounter = 0;

    public Employee(double salary) {
        empCounter++;
        this.empNo = empCounter;
        this.salary = salary;
        totalSalary += salary;
        totalEmployees++;
    }

    public void display() {
        System.out.println("EmpNo: " + empNo + ", Salary: " + salary);
    }

    public static void showStats() {
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Salary: " + totalSalary);
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(10000);
        Employee e2 = new Employee(15000.50);
        Employee e3 = new Employee(12000);
        e1.display();
        e2.display();
        e3.display();
        Employee.showStats();
    }
}
