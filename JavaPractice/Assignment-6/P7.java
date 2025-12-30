// Q.7 Sort the array of 0s , 1s and 2s. ------------>------------->------------> remaining

class Main {
    public static void main(String[] args) {
        int idx = 0;
        int arr[] = { 1, 1, 0, 1, 0, 2, 2, 0 };
        // int n = arr.length;
        int arr2[] = { 0, 0, 0, 0, 0, 0, 0, 0, };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr2[idx++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr2[idx++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                arr2[idx++] = arr[i];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            arr[i] = arr2[i];

        }
        for (int element : arr) {
            System.out.print(" \t" + element);

        }

    }
}
