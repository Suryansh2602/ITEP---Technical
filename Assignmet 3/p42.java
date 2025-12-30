// Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
// 	percentage >= 90% : Grade A 
// 	percentage >= 80% : Grade B 
// 	percentage >= 70% : Grade C 
// 	percentage >= 60% : Grade D 
// 	percentage >= 40% : Grade E 
// 	percentage < 40% : Grade F
import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Physics Marks: ");
            double physics = sc.nextDouble();

        System.out.println("Enter the chemistry Marks: ");
            double chemistry = sc.nextDouble();

        System.out.println("Enter the Biology Marks: ");
            double bio = sc.nextDouble();

        System.out.println("Enter the Maths Marks: ");
            double maths = sc.nextDouble();

        System.out.println("Enter the Computer Marks: ");
            double comp = sc.nextDouble();
            System.out.println("-----------------------");

            double percentage = ((physics+chemistry+bio+maths+comp)/500)*100;
            if(percentage>= 90){
                System.out.println("Grade: A");
            }else if(percentage>= 80){
                System.out.println("Grade: B");
            }
            else if(percentage>= 70){
                System.out.println("Grade: C");
            }
            else if(percentage>= 60){
                System.out.println("Grade: D");
            }
            else if(percentage>= 40){
                System.out.println("Grade: E");
            }
            else if(percentage<40){
                System.out.println("Grade: F");
            }else{
                System.out.println("Invalid Marks");
            }
    

        }
    }
