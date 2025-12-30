//        1               
//       101            
//      10101         
//     1010101           
//    101010101 
//   10101010101

class P48 {
    public static void main(String[] args) {
        for (int i =1; i <=5; i++) {
            for (int space = 1; space<=5-i; space++) {
                System.out.print(" ");
            }
            for( int j=1; j<=((2*i)-1);j++){
                if (j%2==0) {
                    System.out.print(0);
                } else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}
