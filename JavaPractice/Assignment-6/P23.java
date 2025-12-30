// 23. Write a Java program to find the sum and average of one dimensional integer array. 

class Main {
    public static void main(String... args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int avg = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        double result = sum / arr.length;
        System.out.println("sum of array is : " + sum);
        System.out.println("Average of array is :" + result);

    }
}