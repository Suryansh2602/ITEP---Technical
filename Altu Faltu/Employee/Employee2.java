import java.util.ArrayList;
import java.io.*;

class Employee3 {
    private String name;
    private double salary;
    private int age, id;
    private static int count;

    public Employee3() {
        this.name = null;
        this.salary = 0.0;
        this.age = 0;
    }

    public Employee3(String name, double salary, int age) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.id = ++count;

    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

class EmployeeManagement {
    private ArrayList<Employee3> employees;

    public EmployeeManagement() {
        employees = new ArrayList<Employee3>();
    }

    public void addEmployee(String name, double salary, int age) {
        Employee3 e = new Employee3(name, salary, age);
        employees.add(e);
    }

    public void removeEmployee(int id) {
        for (Employee3 e : employees) {
            if (e.getId() == id) {
                employees.remove(e);
            }

        }
    }

    public void display() {
        for (Employee3 e : employees) {
            System.out.println(e.getName() + e.getId() + e.getAge() + e.getId());

        }
    }

}

class Test {
    public static void main(String[] args) {
        File file = new File("employee.txt");
        if (file.exists()) {
            try {
                FileOutputStream fout = new FileOutputStream(file);
                String s = " IO sample output";
                byte data[] = s.getBytes();
                fout.write(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                System.out.println("file not foud");
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}