// Buat class DemoArrayList dalam DemoArrayList.java

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        
        // instansiasi collection baru dengan nama customers dengan
        ArrayList<Customer> customers = new ArrayList<>(2); // Dalam java ArrayList bisa diinstansiasi tanpa harus menentukan size diawal
    
        // instansiasi object baru dengan nama c1 dan c2
        Customer c1 = new Customer(1, "Radit");
        Customer c2 = new Customer(5, "Firansah");
        
        // tambahkan ke dalam ArrayList customers dengan method add
        customers.add(c1);
        customers.add(c2);
        
        // Tambahkan object baru dengan method add
        customers.add(new Customer(4, "Carti"));// Jumlah elemen dalam ArrayList akan bertambah 1 menyesuaikan jumlah elemen yang ditambahkan
        
        // Untuk menambahkan object baru pada index tertentu, lakukan sebagai berikut
        customers.add(2, new Customer(100, "Drake")); // index, object
        
        // Untuk mengetahui posisi dari suatu objek, gunakan method indexOf()
        System.out.println("Index of c1: " + customers.indexOf(c1));
        
        // Untuk mengembalikan object pada index tertentu, gunakan method get()
        Customer c3 = customers.get(1);
        System.out.println("Name of c3: " + c3.name);
        c3.name = "Uzi";
        
        ArrayList<Customer> customers2 = new ArrayList<>();
        // Menambahkan sekumpulan customer baru ke dalam ArrayList secara sekaligus. 
        customers2.add(new Customer(4, "Kendrick Lamar"));
        customers2.add(new Customer(5, "Frank Ocean"));
        customers2.add(new Customer(6, "Tyler, The Creator"));
        
        customers.addAll(customers2);
        
        
        // Gunakan looping untuk menampilkan semua elemen dalam collection customers
        for(Customer c : customers){
            System.out.println(c.toString());
        }
        
        System.out.println(customers);

        customers.sort((cust1, cust2) -> cust1.name.compareTo(cust2.name)); // Mengurutkan berdasarkan nama
        System.out.println("Setelah diurutkan berdasarkan nama:");
        System.out.println(customers);
    }
}
