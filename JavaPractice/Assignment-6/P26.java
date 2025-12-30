// 26. Write a Java program to find the largest and smallest element of an array.

class Main {
    public static void main(String... args) {
        int arr[] = { 3, 5, 63, 6, 7, 2, 1 };
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}