package com.mahendra.demo15.app;

import java.time.LocalDate;
import java.util.Optional;

import com.mahendra.demo15.dao.LoanDAO;
import com.mahendra.demo15.models.ApplianceLoan;
import com.mahendra.demo15.models.HomeLoan;
import com.mahendra.demo15.models.InterestType;
import com.mahendra.demo15.models.Loan;

public class Main {

	public static void main(String[] args) {
		LoanDAO dao = new LoanDAO();
		dao.save(new HomeLoan(1023, LocalDate.of(2019, 2, 10), 5200000,20, 9.3F, 7000000, 1800000, InterestType.FLOATING));
		dao.save(new HomeLoan(1024, LocalDate.of(2008, 8, 15), 4000000, 20, 7.7F, 4500000, 500000, InterestType.FIXED));
		dao.save(new ApplianceLoan(1025, LocalDate.of(2022, 1, 8), 56000, 5, 10.15f, "Mobile Phone","Apple Store" ));
		dao.save(new ApplianceLoan(1026, LocalDate.of(2020, 6, 27), 80000, 5, 11.23f, "Refridgerator","Mega Mart" ));
		
		Optional<Loan> loan = dao.findLoanByAccNum(1024);
		
		if(loan.isPresent()) {
			Loan ln = loan.get();
			System.out.println("Found the loan, loan amount: "+ln.getAmount());
		}else {
			System.out.println("There is no loan with account number 1024");
		}
		
		System.out.println("List of all home loans");
		dao.printLoansOfType("home");
		
		System.out.println("List all appliances loan");
		dao.printLoansOfType("appliance");
		
		

	}

}
