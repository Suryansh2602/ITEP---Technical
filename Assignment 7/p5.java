
class Main {

    public static void main(String[] args) {
        int arr[][] = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        int sumE = 0, sumO = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] % 2 == 0) {
                    sumE += arr[i][j];

                } else {
                    sumO += arr[i][j];
                }

            }
        }
        System.out.println("sum of even no. are: " + sumE);
        System.out.println("sum of odd no. are: " + sumO);

    }

}
