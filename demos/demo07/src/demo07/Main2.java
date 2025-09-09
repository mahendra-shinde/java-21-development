package demo07;

import java.time.LocalDate;
import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		Account[] accounts = new Account[4];
		accounts[0] = new Account(101, "Rajiv", LocalDate.now().minusYears(12).minusMonths(3), 1200);
		accounts[1] = new Account(101, "Rajiv", LocalDate.now().minusYears(10).minusMonths(3), 2000);
		accounts[2] = new Account(102, "Sanjay", LocalDate.now().minusYears(8).minusMonths(5), 6200);
		accounts[3] = new Account(103, "Vijay", LocalDate.now().minusYears(2).minusMonths(2), 1800);
		
		
		List<Account> list1 = Arrays.asList(accounts);
		System.out.println("Number of records :"+list1.size());
		System.out.println("All records from the LIST");
		/// WHAT ??????
		
		Main2.drawHeaderLine();
		list1.forEach(Main2::printRow);
		Main2.drawLine();
		
		Set<Account> set1 = new HashSet<>();
		set1.addAll(list1);		// Copy elements from ONE COLLECTION TO ANOTHER
		System.out.println("\nNumber of records :"+set1.size());
		System.out.println("\nAll records from the SET");
		
		Main2.drawHeaderLine();
		
		/// WHAT ??????
		set1.forEach(Main2::printRow);
		Main2.drawLine();
		
		Map<Integer, Account> map1 = new HashMap<>();
	for (int i = 0; i < 10; i++) {
		int accId = 200 + i;
		String customer = "Customer" + (i + 1);
		LocalDate openingDate = LocalDate.now().minusYears(i + 1).minusMonths(i);
		double balance = 1000 + i * 500;
		map1.put(accId, new Account(accId, customer, openingDate, balance));
	}
	}
	
	public static void printRow(Account acc) {
		System.out.printf("\n| %10d | %-15s | %12s | %14.2f |",acc.accId(), acc.customer(), acc.openingDate(), acc.balance());
	}
	public static void drawHeaderLine() {
		drawLine();
		System.out.printf("\n| %10s | %-15s | %12s | %14s |","Acc-ID","Customer","Opening Date","Balance");
		drawLine();
	}
	
	public static void drawLine() {
		System.out.print("\n+------------+-----------------+--------------+----------------+");
	}

}
