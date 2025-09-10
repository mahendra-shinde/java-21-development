package demo07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main7 {

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
        
        // Static Inner class
        Collections.sort(customers, new SortByLastName());
        
        // Using Lambda 
        Collections.sort(customers, (a,b) -> a.getFirstName().compareTo(b.getFirstName()));
	}

	static class SortByLastName implements Comparator<Customer>{
		@Override
		public int compare(Customer o1, Customer o2) {
			return o1.getLastName().compareTo(o2.getLastName());
		}
	}
}
