
// Design a simple Library Management System using classes with the following:
// A Book class with fields: id, title, author.
// A Library class with methods:
// addBook(Book b)
// listBooks()
// deleteBook(int id)
// Write a program to:
// Add 3 books.
// List all books.
// Delete a book by id and display remaining books.
// Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books
import java.util.ArrayList;

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add a book to library
    public void addBook(Book b) {
        books.add(b);
        System.out.println(b.getTitle() + " added.");
    }

    public void removeBook(int id) {
        Book toRemove = null;
        for (Book book : books) {
            if (book.getId() == id) {
                toRemove = book;
                break;
            }
        }
        if (toRemove != null) {
            books.remove(toRemove);
            System.out.println(toRemove.getTitle() + " removed.");
        } else {
            System.out.println("Book with id " + id + " not found.");
        }
    }

    public void listAllBooks() {

        System.out.println("Listing all books:");
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}

class Book {
    private String title, author;
    private int id;

    public Book(String title, String author, int id) {
        this.author = author;
        this.title = title;
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void displayBookDetails() {
        System.out.println("ID: " + id + "\tTitle: " + title + "\tAuthor: " + author);
    }
}

class Test {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("Java", "James", 1);
        Book b2 = new Book("Limitless", "Jim", 2);
        Book b3 = new Book("RichDadPoorDad", "Robert", 3);

        b1.displayBookDetails();
        b2.displayBookDetails();
        b3.displayBookDetails();
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.listAllBooks();

        library.removeBook(2);

        library.listAllBooks();
    }
}
