
// Student Result Checker
// Create a class Student with fields: name, mathMarks, scienceMarks.
// Use setters to assign values. Add a method getAverage().
import java.util.Scanner;

class Student {
    Scanner se = new Scanner(System.in);
    private String name;
    private int mathMarks;
    private int scienceMarks;
    
    
        public void setName() {
            System.out.println("Enter the name of the student:");
            this.name = se.nextLine();
        }
        public void setMathMarks() {
            System.out.println("Enter the marks of math:");
            this.mathMarks = se.nextInt();
        }
        public void setScienceMarks() {
            System.out.println("Enter the marks of science:");
            this.scienceMarks = se.nextInt();
        }
        public void getAverage() {
            System.out.println("The average of the marks is: " + (this.mathMarks + this.scienceMarks) / 2);
        }
    }
    class TestMain{
        public static void main(String[] args) {
            Student s = new Student();
            s.setName();
            s.setMathMarks();
            s.setScienceMarks();
            s.getAverage();
        }
    }