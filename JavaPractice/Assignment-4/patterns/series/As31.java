// question 31-  9	99	999	9999	  99999 …….
import java.util.Scanner;
class Testmain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        long i=9;
         System.out.print(i + " ");
        for(i=9; n!=0; n--){
              i=i*10+9;
        System.out.print(i + " ");

        }
      
    }
}