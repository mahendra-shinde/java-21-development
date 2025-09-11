package demo10;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		DataManager<Customer> manager1 = new DataManager<>();
		DataManager<Account>  manager2 = new DataManager<>();
		
		manager1.save(new Customer("Tamanna","Bhatia",LocalDate.now().minusYears(38).minusMonths(7), "6464647"));
		
		manager2.save(new Account("SB2567537", "Kajal", "Savings", LocalDate.now().minusMonths(2), 12000));
		
		
		
		
	}
	
	
	
}
