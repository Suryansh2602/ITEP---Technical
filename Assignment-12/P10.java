// Try-with-Resources

//  Open a file using try-with-resources (Java 7+) and show that the file closes automatically without finally.
import java.io.BufferedReader;
import java.io.FileReader;  
import java.io.IOException;
class Main {
    public static void main(String... args) {
        String fileName = "test.txt"; // Ensure this file exists in the working directory
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}