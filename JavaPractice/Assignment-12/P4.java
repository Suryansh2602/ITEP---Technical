//  NullPointerException

// 👉 Declare a String = null. Try to call length() on it. Handle the exception.

// // Expected
// java.lang.NullPointerException caught
import java.util.Scanner;

class Main {
    public static void main(String... args) {
        String str = null;
        try {
            System.out.println("Length of the string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("java.lang.NullPointerException caught");
            e.printStackTrace();
        }
    }
}
