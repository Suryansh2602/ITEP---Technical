class Main {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 6, 7, 8, 0 };
        int n = arr.length - 2;
        int index = 5;
        int val = 10;

        for (int i = n; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = val;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}