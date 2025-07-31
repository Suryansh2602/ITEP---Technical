
// WAP to to count the occurance of all element in array
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Taking input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your original array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Count and print occurrences of unique elements
        for (int i = 0; i < n; i++) {
            boolean alreadyCounted = false;

            // Check if element arr[i] appeared before index i
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyCounted = true;
                    break;
                }
            }

            // If not appeared before, count the occurrences now
            if (!alreadyCounted) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        count++;
                    }
                }
                System.out.println("The occurrence of " + arr[i] + " is " + count);
            }
        }

        sc.close();
    }
}
