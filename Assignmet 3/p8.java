// Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
import java.util.Scanner;
class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" have anymedical cause? (Y/N): ");
        char medicalCause = sc.next().charAt(0);
        if(medicalCause == 'y' || medicalCause == 'Y') {
            System.out.println("Student is allowed to sit in the exam ");
        } else if(medicalCause == 'n' || medicalCause == 'N') {

        
        System.out.println("Enter the number of classes held: ");
        int classesHeld = sc.nextInt();
        
        System.out.println("Enter the number of classes attended: ");
        int classesAttended = sc.nextInt();
        
        if (classesHeld <= 0 || classesAttended <= 0) {
            System.out.println("Invalid input: number should be greater than 0.");
           
        }
      double attendancePercentage = (double) (classesAttended / classesHeld * 100);
        
        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");
        
        if (attendancePercentage <= 75) {
            System.out.println("Student is not allowed to sit in the exam.");
        } else {
            System.out.println("Student is allowed to sit in the exam.");
        }
        } else {
            System.out.println("Invalid input. Please enter 'Y' or 'N'.");
        
    }
}
}