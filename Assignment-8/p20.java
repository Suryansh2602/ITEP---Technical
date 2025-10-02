//  Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.

// Flight class
class Flight {
    String flightNumber;
    String from;
    String to;
    double price;
    static int availableSeats = 3; 

    public Flight(String flightNumber, String from, String to, double price) {
        this.flightNumber = flightNumber;
        this.from = from;
        this.to = to;
        this.price = price;
    }

    public void bookFlight(String passengerName) {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Flight booked for " + passengerName +
                    " on flight " + flightNumber + ". Price: $" + price);
        } else {
            System.out.println("No seats available for booking!");
        }
        showAvailability();
    }

    public void cancelFlight(String passengerName) {
        availableSeats++;
        System.out.println("Flight reservation for " + passengerName + " canceled.");
        showAvailability();
    }

    public static void showAvailability() {
        System.out.println("Seats available: " + availableSeats);
    }
}

// Hotel class
class Hotel {
    String hotelName;
    String city;
    double pricePerNight;
    static int availableRooms = 2; // total rooms for all hotels

    public Hotel(String hotelName, String city, double pricePerNight) {
        this.hotelName = hotelName;
        this.city = city;
        this.pricePerNight = pricePerNight;
    }

    public void bookRoom(String guestName) {
        if (availableRooms > 0) {
            availableRooms--;
            System.out.println("Room booked for " + guestName +
                    " at " + hotelName + ". Price per night: $" + pricePerNight);
        } else {
            System.out.println("No rooms available for booking!");
        }
        showAvailability();
    }

    public void cancelRoom(String guestName) {
        availableRooms++;
        System.out.println("Hotel reservation for " + guestName + " canceled.");
        showAvailability();
    }

    public static void showAvailability() {
        System.out.println("Rooms available: " + availableRooms);
    }
}

// Main class
 class Main {
    public static void main(String[] args) {
        // Create flight and hotel objects
        Flight flight1 = new Flight("AI-202", "Delhi", "Mumbai", 350);
        Flight flight2 = new Flight("AI-305", "Delhi", "Goa", 280);

        Hotel hotel1 = new Hotel("Grand Plaza", "Mumbai", 120);
        Hotel hotel2 = new Hotel("Beach Resort", "Goa", 150);

        System.out.println("=== Travel Booking System ===\n");

        // Flight bookings
        flight1.bookFlight("John Doe");
        flight2.bookFlight("Jane Smith");
        flight1.bookFlight("Bob Lee");
        flight2.bookFlight("Alice"); // This should show "No seats available"

        System.out.println();

        // Hotel bookings
        hotel1.bookRoom("Chris Martin");
        hotel2.bookRoom("Emma Watson");
        hotel1.bookRoom("Liam"); // This should show "No rooms available"

        System.out.println();

        // Cancellations
        flight1.cancelFlight("John Doe");
        hotel2.cancelRoom("Emma Watson");
    }
}
