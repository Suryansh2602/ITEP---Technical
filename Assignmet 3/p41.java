// Write a Java program to calculate profit or loss.
import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost_price, selling_price, profit_loss;
        System.out.println("Enter the cost price:");
        cost_price = sc.nextInt();
        System.out.println("Enter the selling price:");
        selling_price = sc.nextInt();
        if (selling_price > cost_price) {
            profit_loss = selling_price - cost_price;
            System.out.println("Profit is: " + profit_loss);
            }
            else if (selling_price < cost_price) {
                profit_loss = cost_price - selling_price;
                System.out.println("Loss is: " + profit_loss);
                }
                else if(cost_price == selling_price) {
                    System.out.println("No profit or loss");
                    }else{
                        System.out.println("Enter Valid amount: ");
                    }
                    }

    }
