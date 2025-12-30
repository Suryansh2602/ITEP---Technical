import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // File f1 = new File("a1.txt");
        // try{
        // if(!f1.exists())
        // f1.createNewFile();
        // }catch (IOException e){
        // e.printStackTrace();

        // }
        // try {

        // FileWriter fw = new FileWriter("a1.txt");
        // fw.write("This is my first file in java file handling \n What to do next ?
        // \n\t Reading the file???");
        // fw.close();

        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // File f1 = new File("a1.txt");
        // try {
        // Scanner sc = new Scanner(f1);
        // while (sc.hasNextLine()) {
        // System.out.println(sc.nextLine());
        // }
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        try {

            File f1 = new File("a1.txt");
            if (f1.delete()) {
                System.out.println(f1.getName() + " File is deleted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}