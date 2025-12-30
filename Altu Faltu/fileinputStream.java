import java.io.FileInputStream;
import java.util.Scanner;
import java.io.File;

class Main {
    public static void main(String[] args) {
        try {
            File f = new File("a1.txt");
            FileInputStream fout = new FileInputStream(f);
            Scanner sc = new Scanner(System.in);
           String data = sc.nextLine();
			
			byte b[] =  data.getBytes();
			fout.write(b);
			System.out.println("Operation Success...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}