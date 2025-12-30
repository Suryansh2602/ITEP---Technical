// Find Maximum product contigeous sub array 

// Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.
// Example 1:
// Input:
// N = 5
// Arr[] = {6, -3, -10, 0, 2}
// Output: 180
// Explanation: Subarray with maximum product
// is [6, -3, -10] which gives product as 180.

import java.util.Scanner;

class Arr {
    int arr[];
    private int n;

    public Arr(int arr[], int n) {
        this.arr = arr;
        this.n = n;

    }

    public int maxProduct() {
        int max = 0;
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= arr[j];
                if (max < product) {
                    max = product;

                }

            }

        }
        return max;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " Element");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + arr[i] + "");

        }
        System.out.println();
        Arr ar = new Arr(arr, n);
        int res = ar.maxProduct();
        System.out.println(res);

    }
}