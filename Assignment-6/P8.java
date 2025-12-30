// Q.8 Sub array with given sum
// Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int N = sc.nextInt();

        System.out.println("Enter the (S) : ");
        int S = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        int sum = 0, start = 0;
        boolean found = false;

        for (int end = 0; end < N; end++) {
            sum += arr[end];
            while (sum > S && start < end) {
                sum -= arr[start];
                start++;
            }
            if (sum == S) {
                System.out.println((start + 1) + " " + (end + 1)); // 1-based index
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("-1");
        sc.close();
    }
}