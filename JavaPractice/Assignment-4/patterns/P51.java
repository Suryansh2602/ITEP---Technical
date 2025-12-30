// 12345
//  1234
//   123
//    12
//     1

class P51 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                if (j<=i-1||j<i) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();

        }
    }
}