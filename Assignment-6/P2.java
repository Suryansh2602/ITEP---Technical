// Q.2 Find minimum and maximum element in array
class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 }; // Example input; you can change it
        int n = arr.length;
        int min = arr[0], max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
