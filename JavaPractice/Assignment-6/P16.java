// Rearrange the array in alternating positive and negative items
// Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
// Note: Array should start with positive number.

// Example 1:
// Input: 
// N = 9
// Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
// Output:
// 9 -2 4 -1 5 -5 0 -3 2
// Example 2:
// Input: 
// N = 10
// Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
// Output:
// 5 -5 2 -2 4 -8 7 1 8 0 

class Main {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int posCount = 0, negCount = 0;

        // Separate positive (including zero) and negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos[posCount++] = arr[i];
            } else {
                neg[negCount++] = arr[i];
            }
        }

        int i = 0, j = 0, k = 0;

        // Alternately put positive and negative numbers back into arr
        while (i < posCount && j < negCount) {
            arr[k++] = pos[i++]; // positive first
            arr[k++] = neg[j++];
        }

        // If remaining positive numbers
        while (i < posCount) {
            arr[k++] = pos[i++];
        }

        // If remaining negative numbers
        while (j < negCount) {
            arr[k++] = neg[j++];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
        rearrange(arr);
        System.out.println("Rearranged Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
