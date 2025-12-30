// ABCDE
// A  D
// A C
// AB
// A

class P42 {
    public static void main(String... args) {

        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                if (j == 'A'|| j  == i || i == 'E') {
                    System.out.print(j);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
