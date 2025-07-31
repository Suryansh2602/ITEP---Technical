
// WAP to program to calculate the sum of all element of array.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // taking input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your original array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + arr[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all elements of array is : " + sum);

    }
}