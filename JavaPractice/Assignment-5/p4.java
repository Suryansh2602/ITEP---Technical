
// 4. WAP to find an element in array.
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
        // -------------------------------------------------------------------------
        System.out.println("enter the element you want to search : ");
        int e = sc.nextInt(), f = 0, index = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == e)
                f = arr[j];
            index = j;
        }
        System.out.println("your element" + f + " found at " + index + " index");

    }
}