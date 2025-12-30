import java.util.ArrayList;
import java.io.*;

// class EmployeeManagement{
//     private ArrayList<Employee> employees;

//     public EmployeeManagement(){
//         this.employees = new ArrayList<Employee>();
//     }

//     public void addEmployee(String name, double salary, int age){
//         Employee e = new Employee(name, salary, age);
//         employees.add(e);
//     }

//     public void removeEmployee(int id){
//         for(Employee e: employees){
//             if(e.getId() == id){
//                 employees.remove(e);
//             }
//         }
//     }

//     public void display(){
//         for(Employee e : employees){
//             System.out.println(e.getName() + e.getAge() + e.getSalary()  + e.getId() );
//         }
//     }
// }

class Employee implements Serializable {
    private String name;
    private double salary;
    private int age;
    private int id;
    static int count;

    public Employee() {
        this.name = null;
        this.salary = 0.0;
        this.age = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public int getId() {
        return this.id;
    }

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.id = ++count;
    }

    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nSalary: " + this.salary;
    }
}

class Test {
    public static void main(String args[]) {

        File file = new File("employee.txt");
        if (file.exists()) {
            try {
                FileOutputStream fout = new FileOutputStream(file);
                // String s = "IO is very simple";
                // byte data[] = s.getBytes();
                // fout.write(data);

                ObjectOutputStream out = new ObjectOutputStream(fout);

                // out.writeObject(new Employee("Dinesh Bairagi", 21000, 21));
                // out.writeObject(new Employee("Shanti Bairagi", 20000, 19));
                // out.writeObject(new Employee("Darshna Bairagi", 22000, 22));
                // out.writeObject(new Employee("Kirtika Bairagi", 21000, 24));

                System.out.println("Object has been serialized and saved in employee.txt");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                FileInputStream fin = new FileInputStream("employee.txt");
                ObjectInputStream in = new ObjectInputStream(fin);

                while (true) {
                    try {
                        Employee emp = (Employee) in.readObject();
                        System.out.println(emp);
                    } catch (EOFException e) {
                        // End of file reached
                        break;
                    }
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("File doesn't exists");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // EmployeeManagement infobeans = new EmployeeManagement();
        // infobeans.addEmployee("Harsh", 19000, 21);
        // infobeans.addEmployee("Ram", 12000, 20);
        // infobeans.addEmployee("Shyam", 20000, 22);

        // infobeans.display();
    }
}