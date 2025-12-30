/*Q.12
Find common elements in three sorted arrays.
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?
Example 1:
Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.*/

class CommonElementsSimple {
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 10, 20, 20, 40, 80 };
        int[] arr2 = { 6, 7, 20, 20, 80, 100 };
        int[] arr3 = { 3, 4, 15, 20, 20, 30, 70, 80 };

        int i = 0, j = 0, k = 0;

        System.out.print("Common elements: ");

        while (i < arr1.length && j < arr2.length && k < arr3.length) {

            // If all three elements are equal, it's a common element
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");

                // Move all three pointers to next unique element
                int value = arr1[i];
                while (i < arr1.length && arr1[i] == value)
                    i++;
                while (j < arr2.length && arr2[j] == value)
                    j++;
                while (k < arr3.length && arr3[k] == value)
                    k++;

            } else {
                // Find the smallest value and move that pointer
                if (arr1[i] < arr2[j]) {
                    i++;
                } else if (arr2[j] < arr3[k]) {
                    j++;
                } else {
                    k++;
                }
            }
        }
    }
}