// ABCDE
// ABCD
// ABC
// AB
// A

class P14 {
    public static void main(String args[]) {
        for (int i =1; i <=5; i++) {
            char a = 'A';
            for (int j = 0; j<=5-i; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }

    }
}
