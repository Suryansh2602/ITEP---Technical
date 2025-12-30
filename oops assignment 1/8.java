// Mobile Phone Store
// Create a class Mobile with fields: brand, model, price.
// Use setters to set values. Create a method to check if phone is affordable (price < 20000).

import java.util.Scanner;
class Mobile{
    Scanner se = new Scanner(System.in);
    private String brand;
    private String model;
    private int price;

    public void setBrand() {
        System.out.println("Enter Brand of Mobile: ");
        this.brand = se.nextLine();
    }
    public void setModel() {
        System.out.println("Enter Model of Mobile: ");
        this.model = se.nextLine();
    }
    public void setPrice() {
        System.out.println("Enter Price of Mobile: ");
        this.price = se.nextInt();
    }
    public void check() {
        if (this.price < 20000) {
            System.out.println("Mobile is affordable.");
        } else {
            System.out.println("Mobile is not affordable.");
        }
    }
}
class TestMain{
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.setBrand();
        m.setModel();
        m.setPrice();
        m.check();
    }
}