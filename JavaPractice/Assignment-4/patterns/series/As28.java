// question-28   1	2	3	4	 Hello	6	7	8	9	Hello	11	12 ….
 import java.util.Scanner;
 class Testmain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int i=1;
        for(i=1; i<=n; i++){
            if(i%5==0)
            System.out.println("Hello");
            else
            System.out.println(i);
        }
    }
 }