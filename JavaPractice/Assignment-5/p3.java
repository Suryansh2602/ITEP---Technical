// 3. WAP to program calaculate the sum of all even element and all odd element of array

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        int eSum = 0, oSum = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 == 0)
                eSum += arr[j];
            else
                oSum += arr[j];
        }
        System.out.println("the sum of even elements : " + eSum);
        System.out.println("the sum of odd elements : " + oSum);

    }
}