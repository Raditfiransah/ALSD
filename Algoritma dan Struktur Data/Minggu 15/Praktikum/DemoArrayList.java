import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        
        ArrayList<Customer> customers = new ArrayList<>(2);
    
        Customer c1 = new Customer(1, "Alice");
        Customer c2 = new Customer(2, "Bob");
    
        // Add customers to the list
        {
            customers.add(c1);
            customers.add(c2);
        }

    }
    
    
}
