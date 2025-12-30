
//  Count pair with given sum.
// Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
import java.util.Scanner;

class Ksum {
    private int count = 0;

    public Ksum(int k, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                    System.out.println("(" + i + ", " + j + ") -> (" + arr[i] + ", " + arr[j] + ")");
                    ;
                }

            }
        }
        System.out.println(count);
    }

    public void getIndex() {
        System.out.println(count);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        System.out.println("Enter the value of K: ");
        int k = sc.nextInt();
        Ksum s = new Ksum(k, arr);
        s.getIndex();

    }

}