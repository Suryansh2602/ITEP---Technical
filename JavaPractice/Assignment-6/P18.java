// Find largest sum contigeous sub array
// Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

// Example 1:
// Input:
// N = 5
// Arr[] = {1,2,3,-2,5}
// Output:
// 9
// Explanation:
// Max subarray sum is 9
// of elements (1, 2, 3, -2, 5) which 
// is a contiguous subarray.

import java.util.Scanner;

class Arr{
    int arr[];
    private int n;
    public Arr(int arr[], int n ){
        this.arr = arr;
        this.n = n;

    }

public int maxSum(){
int max = arr[0];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (max < sum) {
                   max = sum;
                  

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
        int res = ar.maxSum();
        System.out.println(res);

    }
    }