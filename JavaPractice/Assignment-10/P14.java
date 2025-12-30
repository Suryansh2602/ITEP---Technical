//  Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
// init - to input X and Y from user
// add - to add X and Y and store in R
// multiply - to multiply X and Y and store in R
// power - to calculate X Y and store in R
// display- to display Result R
import java.lang.Math;
import java.util.Scanner;
class MathOperation{
    private double x,y,r;

    public void init(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of x");
     this.x = sc.nextInt();
     
    System.out.println("Enter the value of y");
     this.y = sc.nextInt();


    }

    public double add(){
        this.r =x+y;
        return r;
    }
    public double multiply(){
         this.r =x*y;
        return r;
    }
    public double power(){
        r =Math.pow(x, y);
       
       return r;
    }
    public void display(){
       System.out.println(add());
       System.out.println(multiply());
       System.out.println(power());
    }
}

class Main{
    public static void main(String[] args) {
    MathOperation op = new MathOperation();
    op.init();
    op.display();
    }
}