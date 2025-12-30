
// Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
import java.util.ArrayList;

class Student {
    private String name;
    private char grade;
    private ArrayList<String> courses;

    // Constructor
    public Student(String n, char g) {
        this.name = n;
        this.grade = g;
        this.courses = new ArrayList<>();
    }

    // Method to add a course
    public void addCourse(String course) {
        courses.add(course);
        System.out.println(course + " added to " + name + "'s courses.");
    }

    // Method to remove a course
    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println(course + " removed from " + name + "'s courses.");
        } else {
            System.out.println(course + " not found for " + name + ".");
        }
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }
}

 class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 'A');

        s1.addCourse("Math");
        s1.addCourse("Science");
        s1.displayInfo();

        s1.removeCourse("Math");
        s1.displayInfo();
    }
}
