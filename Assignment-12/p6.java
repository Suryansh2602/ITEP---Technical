// Problem 5: Smart Home System 

// Abstract class Appliance:

// name, power

// abstract methods turnOn(), turnOff()

// concrete method showStatus()

// Subclasses:

// Fan

// Light

// WashingMachine

// Interface SmartDevice with method connectWifi().

// Only Light and WashingMachine are smart devices.

// In main method, turn on/off appliances and connect smart ones to WiFi.

interface SmartDevice {
    void connectWifi();
}

abstract class Appliance {
    private String name;
    private int power;
    private boolean On = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOn(boolean isOn) {
        this.On = isOn;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public boolean getOn(boolean a) {
        return On;
    }

    public Appliance(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public void showStatus() {
        String status = On ? "ON" : "OFF";
        System.out.println(name + " (" + power + "W) is " + status + ".");
    }
}

class Fan extends Appliance {
    public Fan(String name, int power) {
        super(name, power);
    }

    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " is spinning.");
    }

    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " has stopped.");
    }
}

class Light extends Appliance implements SmartDevice {
    public Light(String name, int power) {
        super(name, power);
    }

    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " turned on.");
    }

    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " turned off.");
    }

    public void connectWifi() {
        System.out.println(getName() + " connected to WiFi.");
    }
}

class WashingMachine extends Appliance implements SmartDevice {
    public WashingMachine(String name, int power) {
        super(name, power);
    }

    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " started washing.");
    }

    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " stopped washing.");
    }

    public void connectWifi() {
        System.out.println(getName() + " connected to WiFi.");
    }
}

// Main Test
class Main {
    public static void main(String[] args) {
        Fan fan = new Fan("Ceiling Fan", 75);
        Light light = new Light("Smart Light", 12);
        WashingMachine wm = new WashingMachine("Smart Washer", 250);

        fan.turnOn();
        fan.showStatus();
        fan.turnOff();

        light.turnOn();
        light.connectWifi();
        light.showStatus();
        light.turnOff();

        wm.turnOn();
        wm.connectWifi();
        wm.showStatus();
        wm.turnOff();
    }
}
