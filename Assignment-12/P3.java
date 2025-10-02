//  ArrayIndexOutOfBoundsException

//  Create an array of size 5. Ask the user for an index and print the element. Handle the case when the index is out of range.

// // Expected
// Enter index: 8
// java.lang.ArrayIndexOutOfBoundsException caughts
import java.util.Scanner;
class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Enter index: ");
        try {
            int index = sc.nextInt();
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException caught");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}