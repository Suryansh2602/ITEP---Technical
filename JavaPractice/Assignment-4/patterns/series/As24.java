// question-24     0	4	16	36	64	….. 1 2 3 4 5 6 7 8
import java.util.Scanner;
class Testmain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int a=0;
        System.out.print(a+" ");
        for(int i=1; i<=n; i++){
            i=(2*i)+2;
            System.out.print(i+" ");
        }
       
    }
}
