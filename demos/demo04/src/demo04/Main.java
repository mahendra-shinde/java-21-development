package demo04;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setBirthDate(LocalDate.of(1989, 1, 26));
		customer1.setFirstName("Tushar");
		customer1.setLastName("Kapoor");
		customer1.setPhoneNumber("0226546545");
		
		Customer customer2= new Customer("Mukesh","Khanna",LocalDate.of(1967, 10,2), "567576567");
		
		System.out.println("customer 2 :" + customer2.getFirstName()+" "+customer2.getLastName() );

	}

}
