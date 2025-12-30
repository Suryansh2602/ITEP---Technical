// Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("\t Enter the size of array: ");
        int[] arr = new int[n];

        System.out.println("\t Enter the" + n + " Element");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        int[] temp = new int[n];
        int idx = 0;

        // Copy all  positive elements 
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[idx++] = arr[i];
            }
        }

        // Then copy all negative elements in order
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[idx++] = arr[i];
            }
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        // Print rearranged array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
