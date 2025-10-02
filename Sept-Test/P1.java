// Car Inventory System

// Create a class Car with fields: brand, model, price.

// Implement:

// A default constructor (sets "Unknown" values and price = 0).

// A parameterized constructor to initialize all fields.

// A copy constructor to clone another Car.

// Write a test class to create cars using all

class Car {
    private String brand;
    private String model;
    private double price;

    // default constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0.0;
    }

    public void defaultDetails() {
        System.out.println("\tFrom default Constructor");
        System.out.println("The Brand : " + this.brand + "\nModel : " + this.model + "\nPrice : " + this.price);
    }

    // Parameterized constructor
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void parameterizedDetails() {
        System.out.println("\n\tFrom Parameterized Constructor");
        System.out.println("The Brand : " + this.brand + "\nModel : " + this.model + "\nPrice : " + this.price);
    }

    public Car(Car c) {
        this.brand = c.brand;
        this.model = c.model;
        this.price = c.price;
    }

    public void copyDetails() {
        System.out.println("\n\tFrom Copy Constructor");
        System.out.println("The Brand : " + this.brand + "\nModel : " + this.model + "\nPrice : " + this.price);
    }

}

class Test {
    public static void main(String[] args) {
        Car df = new Car();
        df.defaultDetails();

        Car prm = new Car("Mahindra", "BE-6", 100000);
        prm.parameterizedDetails();

        Car cpy = new Car(prm);
        cpy.copyDetails();
    }
}