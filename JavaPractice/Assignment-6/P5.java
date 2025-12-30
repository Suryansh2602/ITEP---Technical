
// Q.5 Find the kth largest and kth smallest element in array.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + n + " element: ");
            arr[i] = sc.nextInt();
            // sorting array
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[j] > arr[k]) {
                        int temp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = temp;
                    }
                }
            }
            System.out.print("Enter k (for kth smallest/largest): ");
            int k = sc.nextInt();

            int kthSmallest = arr[k - 1];
            int kthLargest = arr[n - k];

            System.out.println("Kth smallest element is: " + kthSmallest);
            System.out.println("Kth largest element is: " + kthLargest);

            sc.close();
        }
    }
}