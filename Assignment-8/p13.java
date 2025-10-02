//12. Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.

class Airplane {
    private int flightNum;
    private String destination;
    private double departureTime;
    private double currentTime;

    public Airplane(int flightNum, String destination, double departureTime, double currentTime) {
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureTime = departureTime;
        this.currentTime = currentTime;
    }

    public void flightStatus() {
        if (departureTime == currentTime) {
            System.out.println(" Flight is on time");
            display();
        } else if (departureTime >= currentTime) {
            System.out.println("Flight is delay");
            display();
        } else {
            System.out.println("Flight is early");
            display();
        }
    }

    public void display() {
        System.out.println("Flight number is : " + this.flightNum);
        System.out.println("Flight Destination : " + this.destination);
        System.out.println("Flight departure time : " + this.departureTime);
    }

}

class Main {
    public static void main(String[] args) {
        Airplane a = new Airplane(8942, "New York", 8.22, 8.56);
        a.flightStatus();
    }
}
