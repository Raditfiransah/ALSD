// Buat class Book dalam Book.java

public class Book {
    public String title, isbn;

    public Book() {}

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
    public String toString() {
        return "ISBN: " + this.isbn + ", Title: " + this.title;
    }
}
