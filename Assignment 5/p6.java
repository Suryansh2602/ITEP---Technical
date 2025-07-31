
// 6. WAP to sort the array
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (arr[j] > arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        System.out.println("Your sorter array is : ");
        for (int a = 0; a < n; a++) {
            System.out.print("\t" + arr[a] + " ");
        }
    }
}