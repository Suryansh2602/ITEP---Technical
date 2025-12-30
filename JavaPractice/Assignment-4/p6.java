import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i=2,a = 1;
        boolean result = false;
        while(i<n){
         a = n%1;
         if(a == 0){
         result=true;
         i++;
         break;
         }
         else{
            result=false;
            i++;
            break;
         }
        }
        if(result == true && n!=1){
            System.out.println("Not prime : "+n);
        }
        else
            System.out.println("Prime : "+n);
       
     }
}
/**7) WAP to check whether entered number is prime or not. */