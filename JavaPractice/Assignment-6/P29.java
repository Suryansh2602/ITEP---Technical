// 29. Suppose a one-dimensional array AR containing integers is arranged in ascending order. Write a java program to search for an integer from AR with the help of Binary search method, 

class Main {
    public static void main(String... args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int val = 5;
        int mid = 0;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == val) {
                System.out.println("Value found at : " + mid);
                break;
            } else if (mid < val) {
                start = mid + 1;
            } else if (mid > val) {
                end = mid - 1;
            }

        }

    }
}