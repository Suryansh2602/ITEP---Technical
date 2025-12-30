// Find it there is any subarray with sum equals to zero
// Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
// Example 1:
// Input:
// 5
// 4 2 -3 1 6

// Output: 
// Yes

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        boolean isPresent = false;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " Element");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + arr[i] + "");

        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    isPresent = true;
                    break;

                }

            }
            if (isPresent)break; {
                
            }

        }
       System.out.println(isPresent?"Yes": "NO");

    }
}