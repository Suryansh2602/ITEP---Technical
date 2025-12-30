import java.util.Scanner;

 class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int i = 0;  
        int spaces = 0;  

        while (i < n) {
            System.out.print("*");

            int j = 0;
            while (j < spaces) {
                System.out.print(" ");
                j++;
            }

            System.out.println("#");

            if (i == 0) {
                spaces = 1;
            } else {
                spaces += 2;
            }

            i++;
        }
    }
}
