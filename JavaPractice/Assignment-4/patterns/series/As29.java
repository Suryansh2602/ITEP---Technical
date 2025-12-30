// question-29     1	11	111	1111	  11111	……

import java.util.Scanner;
class Testmain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int i=1;
        System.out.println(i + " ");
        for(i=0; n!=0; n--){
            i=i*10+1;
            System.out.print(i + " ");
        }
    }
}