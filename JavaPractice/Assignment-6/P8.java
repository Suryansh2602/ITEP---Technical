// Q.8 Sub array with given sum
// Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5,7 };
        int k = 12;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i ; j < arr.length; j++) {
                sum += arr[i];
                if(sum>k)
                break;
                if (sum == k) {
                System.out.println(i+1+" "+(j+1));
            }
            }

        }
    }
}