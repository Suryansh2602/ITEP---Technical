//  5. OOPs Problem

// Library Management (Inheritance + Polymorphism)

// Create an abstract class LibraryItem with fields: title, id.

// Add an abstract method calculateLateFee(int daysLate).

// Create two subclasses:

// Book: Late fee = ₹2 per day.

// DVD: Late fee = ₹5 per day.

// In main, create a list of LibraryItem references (both Book and DVD objects), loop through them, and print late fees using polymorphism.
import java.util.ArrayList;
import java.util.Scanner;

abstract class LibraryItem {
    private String title;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    abstract void calculateLateFee(int daysLate);
}

class Book extends LibraryItem {
    private int late_fees = 2;

    public Book(int id, String title) {
        setId(id);

        setTitle(title);
    }

    public void calculateLateFee(int daysLate) {
        System.out.println("Total late fees to pay for " + daysLate + " : " + late_fees * daysLate);
    }

}

class DVD extends LibraryItem {
    private int late_fees = 5;

    public DVD(int id, String title) {
        setId(id);
        setTitle(title);
    }

    public void calculateLateFee(int daysLate) {
        System.out.println("Total late fees to pay for " + daysLate + " : " + late_fees * daysLate);
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<LibraryItem> libraryItems = new ArrayList<LibraryItem>();
        Book k1 = new Book(11, "Java");
        Book k2 = new Book(12, "Java");
        Book k3 = new Book(13, "Java");
        libraryItems.add(k1);
        libraryItems.add(k2);
        libraryItems.add(k3);

        DVD d1 = new DVD(21, "Database");
        DVD d2 = new DVD(22, "Database");
        DVD d3 = new DVD(23, "Database");

        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the number of due days for Book:  ");
            int Bdays = sc.nextInt();
            System.out.println("Enter the number of due days for DVDs:  ");
            int Ddays = sc.nextInt();

            k.calculateLateFee(Bdays);
            d.calculateLateFee(Ddays);

        }

    }
}