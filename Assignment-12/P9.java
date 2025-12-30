// Throws Keyword

//  Write a method readFile(String fileName) that uses FileReader. Declare it with throws IOException and handle it in main().

import java.io.FileReader;
import java.io.IOException;

class FileDemo {
    public void readFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        fileReader.close();
    }
}

class Main {
    public static void main(String[] args) {
        FileDemo demo = new FileDemo();
        try {
            demo.readFile("test.txt");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}