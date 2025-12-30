
// Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.
import java.util.ArrayList;

class Inventory {
    ArrayList<Product> pc = new ArrayList<Product>();

    public void addProduct(Product p) {
        pc.add(p);
    }

    public void removeProduct(Product p) {
        pc.remove(p);
    }

    public void display() {
        for (Product product : pc) {
            System.out.println(" Product : " + product.getDetails());

        }
    }

    public void inventrySize() {
        if (pc.size() <= 10) {
           System.out.println("Inventry is low"); 
       } else if(pc.size()>=10 && pc.size()<=100) {
            System.out.println("Enough amount");
        } else {
            System.out.println("Inventory is full...");
        }
    }

}

class Product {
    private String product;

    public Product(String q) {
        this.product = q;
    }

    public String getDetails() {
        return product;
    }

}

class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Shampoo");
        Product p2 = new Product("Sugar");
        Product p3 = new Product("Salt");
        Inventory i = new Inventory();
        i.addProduct(p1);
        i.addProduct(p2);
        i.addProduct(p3);
        i.display();
        i.inventrySize();    }
}