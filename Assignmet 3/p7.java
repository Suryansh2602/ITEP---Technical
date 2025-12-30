// A student will not be allowed to sit in exam if his/her attendence is less than 75%.
// Take following input from user
// Number of classes held
// Number of classes attended.
// And print
// percentage of class attended
// Is student is allowed to sit in exam or not.


import java.util.Scanner;
class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of classes held: ");
        int classesHeld = sc.nextInt();
        
        System.out.println("Enter the number of classes attended: ");
        int classesAttended = sc.nextInt();
        
        if (classesHeld <= 0 || classesAttended <= 0) {
            System.out.println("Invalid input: number should be greater than 0.");
           
        }
      double attendancePercentage = (double) (classesAttended / classesHeld * 100);
        
        System.out.println("Percentage attended: " + attendancePercentage + "%");
        
        if (attendancePercentage <= 75) {
            System.out.println("Student is not allowed to sit in the exam.");
        } else {
            System.out.println("Student is allowed to sit in the exam.");
        }
        
    }
}