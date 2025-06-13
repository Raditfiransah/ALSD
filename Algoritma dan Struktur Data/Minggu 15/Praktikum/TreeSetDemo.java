// Buat file TreeSetDemo.java kemudian import java.util.TreeSet;

import java.util.TreeSet;

// Buat class TreeSetDemo.java
public class TreeSetDemo {
    public static void main(String[] args) {
        // Buat objek TreeSet untuk menyimpan data string
        TreeSet<String> fruits = new TreeSet<>();
    
        // Tambahkan beberapa elemen ke dalam TreeSet
        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");
        
        // Cetak Data
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Ngambil elemen paling kecil (paling kiri)
        System.out.println("First: " + fruits.first());
        // Ngambil elemen paling besar (paling kanan)
        System.out.println("Last: " + fruits.last());

        // Ngapus elemen tertentu dari set.
        fruits.remove("Jeruk");
        System.out.println("Setelah menghapus Jeruk:" + fruits);
        
        // Ambil elemen paling kecil DAN HAPUS dia dari set.
        fruits.pollFirst();
        System.out.println("Setelah Poll First:" + fruits);
        
        //  Ambil elemen paling besar DAN HAPUS dia dari set.
        fruits.pollLast();
        System.out.println("Setelah Poll Last:" + fruits);

        
    }
}
