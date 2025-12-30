
// 28. P is one-dimensional array of integers. Write a Java program search for a data VAL from P. If VAL is present in the array then element found  otherwise element not found should be displayed. 
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 6, 2 };
        System.out.println("Enter the value of val :");
        int val = sc.nextInt();
        boolean isPresent = false;

        for (int i = 0; i < p.length; i++) {
            if (p[i] == val)
                isPresent = true;
        }
        if (isPresent)
            System.out.println("element found  ");
        else
            System.out.println("Element not Found ");

    }
}