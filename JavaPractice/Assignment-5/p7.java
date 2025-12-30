
//  WAP to search an element in array using binary search.
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
        // binary search
        
        System.out.println("Enter the value you want to search : ");
        int target = sc.nextInt();
        int low = 0;
        int index = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (int) ((low + high) / 2);
            if (target == arr[mid]) {
                index = mid;
                System.out.println("your element " + target + " found at index " + index);
                break;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                System.out.println("Value not found: ");
                break;
            }

        }

    }
}