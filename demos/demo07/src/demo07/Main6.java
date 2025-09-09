package demo07;

import java.util.*;
import java.util.stream.Collectors;



public class Main6 {
    public static void main(String[] args) {
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
        // Results should be then stored back in the same product object
        products = products.stream()
                .map(p -> {
                    p.amount = p.quantity * p.rate;
                    return p;
                }).collect(Collectors.toSet()); // Collect to force evaluation
        
        products.forEach(System.out::println); // Print all products to verify amounts are set

    // Alternatively, modifying the original collection using forEach
    // products.forEach(product -> product.amount = product.quantity * product.rate);
    // products.forEach(System.out::println); // Print all products to verify amounts are set

        // Example of reduce to get total amount of all products
        double totalAmount = products.stream()
                .mapToDouble(p -> p.getAmount())
                .reduce(0, Double::sum);   // Start with 0 and sum all amounts      
        System.out.println("Total Amount of all products: " + totalAmount);
    }
}
