// Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books
import java.util.ArrayList;

class Library {
    private ArrayList<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(String book) {
        books.add(book);
        System.out.println(book + " added.");
    }

    // Method to remove a book
    public void removeBook(String book) {
        if (books.remove(book)) {
            System.out.println(book + " removed.");
        } else {
            System.out.println(book + " not found.");
        }
    }

    // Method to display all books
    public void display() {
        System.out.println("Books: " + books);
    }
}

 class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Java Programming");
        library.addBook("Data Structures");
        library.display();

        library.removeBook("Java Programming");
        library.display();
    }
}
