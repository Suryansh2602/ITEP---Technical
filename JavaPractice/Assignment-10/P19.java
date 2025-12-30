
//  Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].
import java.util.Scanner;
import java.util.ArrayList;

class Student {
    private String name;
    private int roll, age, score;
    

    public String getName(){
        return this.name;
    }
    
    public int getRoll(){
        return this.roll;
    }

    public int getAge(){
        return this.age;
    }
    public int getScore(){
return this.score;
    }
    

    public Student(String name, int roll, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.roll = roll;

    }

    public String toString() {
        return "\n\tName: " + name + "\n\tRollNo.: " + roll + "\n\tAge: " + age + "\n\tScore: " + score;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> StudentList= new ArrayList<>();
        ArrayList<Student> grp1 = new ArrayList<>();
        ArrayList<Student> grp2 = new ArrayList<>();
        ArrayList<Student> grp3 = new ArrayList<>();
        ArrayList<Student> grp4 = new ArrayList<>();
   
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Name: ");
            String name = sc.next();
            System.out.println("Enter RollNo.: ");
            int roll = sc.nextInt();
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            System.out.println("Enter Score: ");
            int score = sc.nextInt();
            StudentList.add(new Student(name, roll, age, score));
        }
           for ( Student student : StudentList) {
            if (student.getScore() >= 0 && student.getScore() < 50) {
                grp1.add(student);
            } else if (student.getScore() >= 50 && student.getScore() < 65) {
                grp2.add(student);
            } else if (student.getScore() >= 65 && student.getScore() < 80) {
                grp3.add(student);
            } else if (student.getScore() >= 80 && student.getScore() <= 100) {
                grp4.add(student);
            }
        }
        System.out.println("\nStudents with score [0-50]:");
        for (Student s : grp1) {
            System.out.println(s);
        }

        System.out.println("\nStudents with score [50-65]:");
        for (Student s : grp2) {
            System.out.println(s);
        }

        System.out.println("\nStudents with score [65-80]:");
        for (Student s : grp3) {
            System.out.println(s);
        }

        System.out.println("\nStudents with score [80-100]:");
        for (Student s : grp4) {
            System.out.println(s);
        }
    }

    }

    
 
