// You are building a transportation system for a logistics company.
// Requirements:
// Every Vehicle should have:
// a registration number,
// a method to start,
// a method to stop.
// Some vehicles run on Fuel (like Car, Truck), while others run on Electricity (like ElectricBike, ElectricCar).
// Create an interface Chargeable that forces all electric vehicles to implement:
// chargeBattery() method.
// Create an abstract class Vehicle that:
// Stores the registration number.
// Has abstract methods start() and stop().
// Has a concrete method displayInfo() to show vehicle details.
// Create subclasses:
// Car (inherits from Vehicle) → Fuel based.
// Truck (inherits from Vehicle) → Fuel based.
// ElectricBike (inherits from Vehicle and implements Chargeable).
// ElectricCar (inherits from Vehicle and implements Chargeable).
// In the main class (TransportSystem),
// Create objects of all types of vehicles.
// Call their methods (start, stop, chargeBattery where required).
// Expected Output Example
// Car KA01AB1234 starting with petrol engine...
// Car KA01AB1234 stopped.
// Truck KA02XY9876 starting with diesel engine...
// Truck KA02XY9876 stopped.
// Electric Bike KA03EL5678 starting silently...
// Electric Bike KA03EL5678 battery charging...
// Electric Bike KA03EL5678 stopped.
// Electric Car KA04EV4321 starting silently...
// Electric Car KA04EV4321 battery charging...
// Electric Car KA04EV4321 stopped.

interface Chargeable {
    void chargeBattery();

}

abstract class Vehicle {
    private String registration;

    public Vehicle(String registration) {
        this.registration = registration;
    }

    public String displayInfo() {
        return registration;
    }

    abstract void Start();

    abstract void Stop();

}

class Car extends Vehicle {

    public Car(String registration) {
        super(registration);
    }

    public void Start() {
        System.out.println("Car" + displayInfo() + " is strarting with Petrol Engine");
    }

    public void Stop() {
        System.out.println("Car" + displayInfo() + " Stopped.");
    }

}

class Truck extends Vehicle {

    public Truck(String registration) {
        super(registration);
    }

    public void Start() {
        System.out.println("Truck " + displayInfo() + " Starting with diesel Engine");

    }

    public void Stop() {
        System.out.println("Truck Stopped.");
    }

}

class ElectricCar extends Vehicle implements Chargeable {

    public ElectricCar(String registration) {
        super(registration);
    }

    public void chargeBattery() {
        System.out.println("Electric car " + displayInfo() + "Battery Charging...");
    }

    public void Start() {
        System.out.println("The Electric car" + displayInfo() + " is starting Silently");
    }

    public void Stop() {
        System.out.println("Electric car" + displayInfo() + " Stopped...");
    }

}

class ElectricBike extends Vehicle implements Chargeable {
    public ElectricBike(String registration) {
        super(registration);
    }

    public void chargeBattery() {
        System.out.println("Electric bike " + displayInfo() + " Is charging...");
    }

    public void Start() {
        System.out.println("Electric bike " + displayInfo() + "is starting silently");
    }

    public void Stop() {
        System.out.println("Electric Bike " + displayInfo() + " stopped.");
    }
}

class TransportSystem {
    public static void main(String[] args) {
        Car car = new Car("KA01AB1234");
        Truck truck = new Truck("KA3E02XY9876");
        ElectricBike ebike = new ElectricBike("KA03EL5678");
        ElectricCar ecar = new ElectricCar("KA04EV4321");
        car.Start();
        car.Stop();
        truck.Start();
        truck.Stop();
        ebike.chargeBattery();
        ebike.Start();
        ebike.Stop();
        ecar.chargeBattery();
        ecar.Start();
        ecar.Stop();

    }
}