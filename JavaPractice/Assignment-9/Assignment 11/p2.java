// to lower case
import java.lang.String;
import java.util.Scanner;
class p2 {           
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String text;

        System.out.println("Type in:");
        text = input.nextLine();

        switch(text){
            case "A":
                System.out.println("a");
                break;
            case "b":
                System.out.println("B");
                break;

        }
    }
}