//  Input name of a person and count how many vowels it contains. Use String class methods.
import java.lang.String;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your name: ");
        String str = sc.nextLine();
        int count = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {      
            
                    count ++;
                    
                }
            }
            System.out.println(count);
        }
    }
