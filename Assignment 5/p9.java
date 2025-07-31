
// WAP to delete element from array at specific position.

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data size");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Your original array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter position to delete (1 to " + n + ")");
        int position = sc.nextInt();

        // Position validity: 1 <= position <= n
        if (position < 1 || position > n) {
            System.out.println("Invalid position");
        } else {
            // Shift elements left from position
            for (int i = position - 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n = n - 1; // reduce size

            System.out.println("Array after deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
