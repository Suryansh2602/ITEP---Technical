
// WAP to to count the occurance of all element in array
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("How many numbers do you want to save?");
        int n = se.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = se.nextInt();
        }

        System.out.println("The array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) // already counted this element
                continue;
            int occ = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    occ++;
                    visited[j] = true; // mark as counted
                }
            }
            System.out.println("Occurrence of " + arr[i] + " is " + occ);
        }
        se.close();
    }
}
