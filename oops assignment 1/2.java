// Book Library
// Create a class Book with fields: title, author, and price.
// Use setters to assign values and a method to print book details.

class Book {
    private String author, title;
    private int price;

    public void setDetail(String author, String title, int price) {
        this.author = author;
        this.title = title;
        this.price = price;

    }

    public void print() {
        System.out.println("book's title  is :" + title);
        System.out.println("book's author is :" + author);
        System.out.println("book's price is :" + price);

    }
}

class TestMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setDetail("ken blanchard", "leadership", 150);
        b1.print();
    }
}