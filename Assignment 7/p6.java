
class Main {

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 }, // 10
                { 3, 1, 2, 6 }, // 12
                { 8, 9, 0, 1 } // 18
        };
        int max[] = new int[3];
        int max1 = 0;

        
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
            max[i] = sum;

            if (max1 < sum) {
                max1 = sum;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (max[i] == max1)
                for (int j : arr[i])
                    System.out.print(" " + j);
        }
    }

}
