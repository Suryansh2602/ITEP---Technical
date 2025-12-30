                                                                
// *         *
// **       **
// ***     ***
// ****   ****
// ***** *****

class P44 {
    public static void main(String[] args) {                                  
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j <= i || i == 5 || j > 10 - i)
                    System.out.print("*");
                else {
                    System.out.print(" ");

                }

            }

            System.out.println();

        }
    }
}
// for(

// int i = 1;i<=rows;i++)
// {
//             // Print left stars
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }

//             // Print spaces between stars
//             for(int j = 1; j <= totalSpaces; j++) {
//                 System.out.print(" ");
//             }

//             // Print right stars
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }

//             // Move to next line
//             System.out.println();

//             // Decrease spaces after each row, except last
//             if(i != rows) {
//                 totalSpaces -= 2;