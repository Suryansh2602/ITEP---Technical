// WAP to calculate the percentage of students
import java.util.Scanner;
class P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of sub 1 : ");
        double marks1 = sc.nextDouble();
        System.out.println("Enter the marks sub 2 : ");
        double marks2 = sc.nextDouble();
        System.out.println("Enter the marks sub 3 : ");
        double marks3 = sc.nextDouble();
        double marks = marks1+marks1+marks3;
        System.out.println("Obtained Marks is :  "+marks);
        System.out.println("Enter the total Marks: ");
        double totalMarks = sc.nextDouble();
        double percent = (marks/totalMarks)*100;
        System.out.println("percentage of student is: "+percent + "%");
    }
}