// Java OOP Exercises (using Setters)
// Employee Record System
// Create a class Employee with private fields: id, name, and salary.
// Use setter methods to assign values. Add a method to display employee details.

class Employee {
    private int id, salary;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDetail(String name, int id, int salary) {
        setName(name);
        setId(id);
        setSalary(salary);
    }

    public void display(){
        System.out.println("Employee name is :" + name );
        System.out.println("Employee id is :" + id );
        System .out.println("Employee salary is :"+ salary);
    }
}
    
class TestMain{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setDetail("anuj",123,150000);
        emp.display();
    }
}
