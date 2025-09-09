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
		list1.forEach(System.out::println);
		
		
		Set<Account> set1 = new HashSet<>();
		set1.addAll(list1);		// Copy elements from ONE COLLECTION TO ANOTHER
		System.out.println("Number of records :"+set1.size());
		System.out.println("All records from the SET");
		/// WHAT ??????
		set1.forEach(System.out::println);
		
	}

}
