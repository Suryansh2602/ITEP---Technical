
// 5. WAP to replace all element with 0 which is multiple of 5
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
        System.out.println("your array is : ");
        for (int a = 0; a < n; a++) {
            System.out.print("\t" + arr[a] + " ");
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] % 5 == 0)
                arr[j] = 0;
        }
        System.out.println("your updated array is : ");
        for (int k = 0; k < n; k++) {
            System.out.print("\t" + arr[k] + " ");
        }
    }
}
