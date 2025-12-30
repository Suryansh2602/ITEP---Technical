/*  Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
*/
class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    //getter
    public String getAuthor() {
        return author;
    }

    //getter
    public String getTitle() {
        return title;
    }

    //getter
    public String getISBN() {
        return ISBN;
    }

    //display
    public void display() {
        System.out.println("Book Author : " + getAuthor());
        System.out.println("Book Title : " + getTitle());
        System.out.println("Book ISBN : " + getISBN());
    }

    //
    public void addCollectiom() {
        display();
        System.out.println("Added to the collection");
      
    }

    public void removeCollection() {
        display();
        System.out.println("Removed to the collection !!!");
        
    }
}

class Main {
    public static void main(String args[]) {
        Book b = new Book("Can we be Stranger again", " Ritivika Iyer", "ISBN0001563");
        b.display();
        b.addCollectiom();
        b.removeCollection();
    }
}
