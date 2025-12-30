//     1
//     2
//     3
//     4
// 123454321
//     4
//     3
//     2
//     1

class P47 {
    public static void main(String[] args) {
        for (int i = 1; i<=9; i++) {
            for (int j = 1; j <=9; j++) {
                if (i==5 || j==5) {
                    System.out.print(i);
                } else
                    System.out.print(" ");
            }
        }
        System.out.println();
    }
}

