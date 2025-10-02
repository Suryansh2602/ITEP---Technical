// 1. Object-Oriented Programming Problem
//  Problem: Library Management (Classes & Inheritance)
// Create a small library system:
// Create a base class Book with:
// title, author, price.
// A method displayInfo() to print book details.
// Create a derived class EBook with:
// fileSize (in MB) and format.
// Override displayInfo() to include ebook details.
// In main(), create an array of Book references, store both Book and EBook objects, and print their details using polymorphism.

class Book {
    private String title, author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("\t Title : " + title);
        System.out.println("\t Author : " + author);
        System.out.println("\t Price : " + price);
    }

}

class EBook extends Book {
    private int fileSize;
    private String format;

    public EBook(String title, String author, double price, int fileSize, String format) {
        super(title, author, price);
        this.fileSize = fileSize;
        this.format = format;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("\t fileSize : " + fileSize +" MB");
        System.out.println("\t Format : " + format);
    }

}

class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("RichDadPoorDad", "Robert T. Kiyosaki", 250);
        books[1] = new EBook("Java", "James Goslin", 755, 20, "PDF");
        books[2] = new EBook("LIMITLESS", "Jim Kwik", 350, 12, "DocX");

        for (Book b : books) {
            System.out.println("\t---------------");
            b.displayInfo();
        }
    }
}