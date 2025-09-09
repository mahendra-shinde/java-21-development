package demo07;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Main4 {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<>();
		for (int i = 0; i < 100; i++) {
			int accId = 200 + i;
			String customer = "Customer" + (i + 1);
			LocalDate openingDate = LocalDate.now().minusYears(i + 1).minusMonths(i);
			double balance = 1000 + i * 500;
			accounts.add( new Account(accId, customer, openingDate, balance));
		}
		
		//Basic Logic for finding an account
		int findId = 209;
		System.out.println("Find account "+findId);
		Account temp = null;
		System.out.printf("Searching ");
		for(Account ac : accounts) {
			System.out.printf(".");
			if(ac.accId() == findId) {
				temp = ac;
				break;
			}
		}
		System.out.println(); //Empty line
		if(temp == null) {
			System.out.println("Account was not found!");
		}else
		{
			System.out.println("Found : "+temp);
		}
		
		//////// Collection Streams
		Optional<Account> result = accounts.stream().filter(x -> x.accId() == findId ).findFirst();
		if(result.isPresent()) {
			System.out.println("Found : "+result.get());
		}else {
			System.out.println("Not found!");
		}
		
		//Find all accounts where accId is divisible by 5 and then search for opening month JAN
		List<Account> results2 = accounts.stream()
							.filter(x -> x.accId()%5==0)
							.filter(x -> x.openingDate().getMonth()==Month.JANUARY )
							.collect(Collectors.toUnmodifiableList());
		
		System.out.println("Found records "+results2.size());
		results2.forEach(System.out::println);
		
	}
	
	

}
