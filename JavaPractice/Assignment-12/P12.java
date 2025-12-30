// File Upload System

// A web app allows file upload. But the file path provided by the user does not exist.

// Which Java exception will occur?

// How would you handle it so the program doesn’t crash?

// Should you retry or show a friendly message to the user?

import java.io.File;
import java.io.FileNotFoundException;

class FileUpload {
    public void uploadFile(String filePath) {
        File file = new File(filePath);
        try {
            // Simulate file upload
            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + filePath);
            }
            System.out.println("File uploaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// FileNotfoundException will occur if the file path does not exist.
// To handle it, we catch the exception and show a friendly message to the user.
// In this case, we choose to show a friendly message rather than retrying.
class Main {
    public static void main(String[] args) {
        FileUpload fileUpload = new FileUpload();
        fileUpload.uploadFile("non_existent_file.txt");
    }
}