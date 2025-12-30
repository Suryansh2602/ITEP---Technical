// 24. Write a Java program to swap first and last element of an integer 1-d array.

class Main {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}