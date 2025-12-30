// E-commerce Discount Calculation

// Suppose you are dividing total amount by quantity to get per item price. If quantity = 0, what happens?

// Which exception will occur?

// How will you ensure the program continues and doesn’t stop execution?

import java.util.Scanner;

class Main {

    public void Store() {
        Scanner sc = new Scanner(System.in);
        
        int totalAmount = sc.nextInt();
        int quantity = sc.nextInt();
        try {
            int pricePerItem = totalAmount / quantity; 
            System.out.println("Price per item: " + pricePerItem);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Setting price per item to 0.");
            Store();
        }
        System.out.println("Calculation continues...");

    }

    public static void main(String[] args) {
        Main m = new Main();
        m.Store();
    }
}