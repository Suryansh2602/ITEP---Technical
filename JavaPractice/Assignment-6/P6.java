
// Q.6Find occurance of an integer number in array.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the integer to find its occurrence: ");
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("The number " + target + " occurs " + count + " times in the array.");

        sc.close();
    }
}
