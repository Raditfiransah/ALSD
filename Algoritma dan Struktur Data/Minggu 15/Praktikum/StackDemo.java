// Buat file StackDemo.java. Lakukan import java.util.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        
        // Buat class Book dengan atribut ISBN dan title
        Book book1 = new Book("1234", "The Republic");
        Book book2 = new Book("5678", "The Art of War");
        Book book3 = new Book("9101", "The Prince");

        // Tambahkan objek Book ke dalam Stack
        Stack<Book> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        // Tampilkan isi Stack
        Book temp = books.peek();
        if (temp != null) { // mengecek apakah Stack tidak kosong
            System.out.println("Buku teratas:");
            System.out.println(temp.toString());
        }

        // Hapus objek Book dari Stack
        Book temp2 = books.pop();
        if (temp2 != null) { // mengecek apakah Stack tidak kosong
            System.out.println("Popped Buku dari stack:");
            System.out.println(temp2.toString());
        }

        // Tampilkan semua buku dalam Stack
        System.out.println("Isi Stack setelah pop:");
        for (Book book : books) {
            System.out.println("Buku dalam stack:");
            System.out.println(book.toString());
        }

        // Tampilkan isi Stack
        System.out.println("Isi Stack:");
        System.out.println(books);

        // Melakukan pencarian elemen pada stack menggunakan method search()
        // Misal kita ingin mencari posisi book1 dalam stack
        int idx = books.search(book1);
        if (idx != -1) {
            System.out.println("Book1 ditemukan pada posisi ke-" + idx + " dari atas stack.");
        } else {
            System.out.println("Book1 tidak ditemukan dalam stack.");
        }
    }
}
