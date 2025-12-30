// a
// bc
// d f
// g  j
// klmno

class P33 {
    public static void main(String... args) {
        char a = 'a';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j || i == 5) {
                    System.out.print(a);
                    a++;
                } else {
                    System.out.print(" ");
                    a++;
                }

            }
            System.out.println();
        }
    }
}
