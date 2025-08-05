// Car Info Manager
// Create a class Car with fields: brand, model, and year.
// Use setters to assign values. Create a method to print full car info.
class Car {
    private String brand;
    private String model;
    private int year;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class TestMain{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("toyoya");
        car1.setModel("Fortuner");
        car1.setYear(2010);
        car1.display();
        
    }
}