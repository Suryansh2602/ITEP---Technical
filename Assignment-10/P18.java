// Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
// Accept five product information from user and store in an array
// Find Pid of product with highest price.
// Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product * quantity of product).

import java.util.Scanner;

class Product {
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.quantity = quantity;
        this.price = price;

    }

    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}

class XYZ {

    public static double totalAmount(Product[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].getPrice() * arr[i].getQuantity();
        }
        return total;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] arr = new Product[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Product id: ");
            int pid = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            arr[i] = new Product(pid, price, quantity);
        }

        double maxPrice = arr[0].getPrice();
        int maxPid = arr[0].getPid();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getPrice() > maxPrice) {
                maxPrice = arr[i].getPrice();
                maxPid = arr[i].getPid();
            }
        }
        System.out.println("Pid of product with highest price: " + maxPid);

        double totalSpent = totalAmount(arr);
        System.out.println("Total amount spent on all products: " + totalSpent);

    }
}
