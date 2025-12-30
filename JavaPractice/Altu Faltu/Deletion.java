class Main {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4, 5, 6, 7 };

        for (int i = 2; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}