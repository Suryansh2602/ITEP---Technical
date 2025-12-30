// a
// ab
// abc
// abcd
// abcde

class P17 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            char A = 'a';
            for (int j = 1; j <= i; j++) {
                System.out.print(A);
                A++;
            }
            System.out.println();
        }

    }   
}