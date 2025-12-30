//. Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.
import java.util.ArrayList;
class School {
    private ArrayList<String> students;
    private ArrayList<String> teachers ;
    private ArrayList<String> classes;
     
    //constructor
    public School() {
         this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.classes = new ArrayList<>();
    }

    //addstudents
    public void addStudents(String student) {
        students.add(student);
    }

    //addteacher
    public void addTeacher(String teacher) {
        teachers.add(teacher);
    }

    //addclasses
    public void addClasses(String clasess){
        classes.add(clasess);
    }

    //removestudents
    public void removeStudent(String student) {
        students.remove(student);
    }

    //removeteachers
    public void removeTeacher(String teacher) {
        teachers.remove(teacher);
    }

    //removeclasses
    public void removeclasses(String clasess) {
        classes.remove(clasess);
    }

    public void display() {
        System.out.println("Students : " + students);
        System.out.println(" Teachers : " + teachers);
        System.out.println("Classess : " + classes);
    }
}

class Main {
    public static void main(String args[]) {
        School s = new School();
        s.addStudents("sneha");
        s.addStudents("simran");
        s.addTeacher("purav sir");
        s.addTeacher("nimrat mam");
        s.addClasses("IT");
        s.display();
    }
}