// Buat class Customer dalam Customer.java

public class Customer {
    public int id;
    public String name;

    public Customer() {}
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "Customer ID: " + this.id + ", Name: " + this.name;
    }
}
