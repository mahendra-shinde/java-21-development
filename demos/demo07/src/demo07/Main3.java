package demo07;

import java.time.LocalDate;
import java.util.*;

public class Main3 {

	public static void main(String[] args) {
		Map<Integer, Account> accounts = new TreeMap<>();

		for (int i = 0; i < 10; i++) {
			int accId = 200 + i;
			String customer = "Customer" + (i + 1);
			LocalDate openingDate = LocalDate.now().minusYears(i + 1).minusMonths(i);
			double balance = 1000 + i * 500;
			accounts.put(accId, new Account(accId, customer, openingDate, balance));
		}

		// Find account 202
		Account a202 = accounts.get(202);
		if (a202 != null) {
			System.out.println("Found : " + a202);
		}

		System.out.println("Key SET: " + accounts.keySet());
		System.out.println("Values: " + accounts.values());
	}

}
