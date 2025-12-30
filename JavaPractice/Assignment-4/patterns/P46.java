// ***** *****
// ****   ****
// ***     ***
// **       **
// *         *
// *         *
// **       **
// ***     ***
// ****   ****
// ***** ***** 

class P46 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                // Print stars for the first block
                if (j < 5 - i) {
                    System.out.print("*");
                }
                // Print spaces in the middle
                else if (j < 5 - i + 2 * i + 1) {
                    System.out.print(" ");
                }
                // Print stars for the second block
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j <= i || i == 5 || j > 10 - i)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }

            System.out.println();

        }
    }

}