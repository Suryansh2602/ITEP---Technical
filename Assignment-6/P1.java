// Q.1 Peak an element

// An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
// Given an array arr[] of size N, find the index of any one of its peak elements.
// Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int n = arr.length;
        int peakIndex = -1;

        for (int i = 0; i < n; i++) {
            boolean left = (i == 0) || (arr[i] >= arr[i - 1]);
            boolean right = (i == n - 1) || (arr[i] >= arr[i + 1]);
            if (left && right) {
                peakIndex = i;
                break;
            }
        }

        // Output is 1 if the found index is a peak, else 0
        if (peakIndex != -1) {
            System.out.println(1); // Found valid peak
            System.out.println(peakIndex);
        } else {
            System.out.println(0); // No peak found
        }
    }
}
