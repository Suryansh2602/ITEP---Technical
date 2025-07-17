// Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.Scanner;
class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the age of first person: ");
        int age1 = sc.nextInt();
        
        System.out.println("Enter the age of second person: ");
        int age2 = sc.nextInt();
        
        System.out.println("Enter the age of third person: ");
        int age3 = sc.nextInt();

        if(age1== age2 && age2 == age3) {
            System.out.println("All three persons are of the same age.");
        } 

        if(age1 >0 && age2 > 0 && age3 > 0) {
            int oldest , youngest; 
            if(age1 >=age2 && age1>=age3){
                oldest = age1;
            }else if (age2>=age1&&age2>=age3){
                oldest = age2;
            }else if(age3>=age1&&age3>=age2){
                oldest = age3;

            }else{
                System.out.println("Invalid ages entered.");
            }
            if(age1 <= age2 && age1 <= age3){
                youngest = age1;
            }else if (age2 <= age1 && age2 <= age3){
                youngest = age2;
            }else if(age3 <= age1 && age3 <= age2){
                youngest = age3;
            }else{
                System.out.println("Invalid ages entered.");}
        } else {
            System.out.println("Please enter valid ages greater than 0.");
        }

    }
}
        
        
       