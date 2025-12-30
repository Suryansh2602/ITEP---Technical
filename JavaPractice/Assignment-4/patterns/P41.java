// 11111
//  2222
//   333
//    44
//     5

class P41 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (i <= 6 - j)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
