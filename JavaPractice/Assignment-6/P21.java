// Sub with equal 0s and 1s
// Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s. 
// Example 1:
// Input:
// n = 7
// A[] = {1,0,0,1,0,1,1}
// Output: 8
// Explanation: The index range for the 8 
// sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
// (4, 5) ,(2, 5), (0, 5), (1, 6)

class Main {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
        int cnt = 0, n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    sum -= 1;

                } else {
                    sum += 1;
                }
                if (sum == 0) {
                    cnt++;
                }
            }

        }
        System.out.println(cnt);
    }
}