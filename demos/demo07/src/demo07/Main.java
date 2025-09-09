package demo07;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Raw collections
		
		List data1 = new LinkedList();
		data1.add("Mahendra");
		data1.add(new Customer(101,"Raj","Kapoor"));
		data1.add(new Customer(102,"Shashi","Kapoor"));
		data1.add(2300);
		
		List<Customer> data2 = new LinkedList<Customer>();
		//data2.add("mahendra");
		data2.add(new Customer(101,"Raj","Kapoor"));
		data2.add(new Customer(102,"Amitabh","Bacchan"));
		data2.add(new Customer(103,"Govardhan","Asarani"));
		
		System.out.println("List all customer using 'for' loop");
		for(Customer c : data2) {
			System.out.println(c.getFirstName()+" "+c.getLastName());
		}
		
		System.out.println("List all using Lambda !!");
		// Using Lambda for "Consumer" interface
		data2.forEach(x -> System.out.println(x.getFirstName()+" "+x.getLastName()));
		
		// Using method reference 
		data2.forEach(Main::print);
	}
	
	// Method Reference:
	// An elegible method should be:
	// 1. STATIC 
	// 2. VOID
	// 3. Must match the argument type and argument count with functional interface
	static void print(Customer c) {
		System.out.println(c.getFirstName()+" "+c.getLastName());
	}

}
