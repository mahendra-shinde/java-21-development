package demo07;

import java.util.*;

class Product {
    int productid;
    String name;
    int quantity;
    float rate;
    double amount;

    public Product(int productid, String name, int quantity, float rate) {
        this.productid = productid;
        this.name = name;
        this.quantity = quantity;
        this.rate = rate;
        this.amount = 0; // Initialize amount to 0
    }

    @Override
    public String toString() {
        return "Product{" +
                "productid=" + productid +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", rate=" + rate +
                ", amount=" + amount +
                '}';
    }
}

public class Main5 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "John", "Doe"));
        customers.add(new Customer(2, "Jane", "Smith"));
        customers.add(new Customer(3, "Alice", "Smith")); 
        customers.add(new Customer(4, "Bob", "Brown"));
        customers.add(new Customer(5, "Charlie", "Smith")); 
        customers.add(new Customer(6, "Eve", "Miller"));
        customers.add(new Customer(7, "Frank", "Wilson"));
        customers.add(new Customer(8, "Grace", "Moore"));
        customers.add(new Customer(9, "Hank", "Taylor"));
        customers.add(new Customer(10, "Ivy", "Anderson"));
        customers.add(new Customer(11, "Jack", "Thomas"));
        customers.add(new Customer(12, "Kathy", "Jackson"));
        customers.add(new Customer(13, "Leo", "White"));
        customers.add(new Customer(14, "Mia", "Smith")); 
        customers.add(new Customer(15, "Nina", "Martin"));
        customers.add(new Customer(16, "Oscar", "Thompson"));
        customers.add(new Customer(17, "Paul", "Garcia"));
        customers.add(new Customer(18, "Quinn", "Martinez"));
        customers.add(new Customer(19, "Rose", "Robinson"));
        customers.add(new Customer(20, "Sam", "Clark"));
        
        // Using Stream API to find all customers with last name "Smith" and before collecting them
        // into a list, make their first names uppercase and then print them
        customers.stream()
                 .filter(c -> "Smith".equals(c.getLastName()))
                 .map(c -> {
                     c.setFirstName(c.getFirstName().toUpperCase());
                     return c;
                 })
                 .forEach(c -> System.out.println(c.getCustId() + ": " + c.getFirstName() + " " + c.getLastName()));

        // Create a Set of 10 products with amount = 0
        Set<Product> products = new HashSet<>(Arrays.asList(
            new Product(1, "Product1", 10, 5.5f),
            new Product(2, "Product2", 20, 15.0f),
            new Product(3, "Product3", 5, 25.0f),
            new Product(4, "Product4", 8, 12.5f),
            new Product(5, "Product5", 12, 7.5f),
            new Product(6, "Product6", 15, 10.0f),
            new Product(7, "Product7", 18, 20.0f),
            new Product(8, "Product8", 22, 30.0f),
            new Product(9, "Product9", 6, 50.0f),
            new Product(10, "Product10", 14, 40.0f)
        ));

        // Calculate and print amount for each product using Stream and map
        products.stream()
                .map(product -> {
                    product.amount = product.quantity * product.rate;
                    return product;
                })
                .forEach(System.out::println);
    }
}
