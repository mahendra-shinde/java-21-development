package demo05;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Account ac1 = new Account("SB10378478", "Abhishek Bacchan", "Savings", LocalDate.now().minusYears(5).minusDays(12), 1200);
		ac1.setCustomerName("Aishwarya Rai");
		ac1.setBalance(1200000);
		
		System.out.println(ac1);
		
	}

}
