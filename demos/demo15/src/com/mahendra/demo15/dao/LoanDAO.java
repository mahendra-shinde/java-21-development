package com.mahendra.demo15.dao;

import java.text.NumberFormat;
import java.util.*;

import com.mahendra.demo15.models.*;

public class LoanDAO {
	private List<Loan> loans = new LinkedList<>();
	
	public void save(Loan loan) {
		System.out.println("Adding a new loan "+loan.getAccNum());
		loans.add(loan);
	}
	
	public Optional<Loan> findLoanByAccNum(int accNum) {
		return loans.stream().filter(x -> x.getAccNum()==accNum ).findFirst();
	}
	
	public void printLoansOfType(String type){
		switch(type.toLowerCase()) {
		case "home":
			listHomeLoans();
			break;
		case "appliance":
			listApplianceLoans();
			break;
		default:
			System.out.println("Loan type must be either 'home' or 'applicance' !");
		}
	}

	private void listApplianceLoans() {
		for(Loan l : loans) {
			if(l instanceof ApplianceLoan) {
				ApplianceLoan loan = (ApplianceLoan)l;
				System.out.println(loan.getAccNum()+" for Appliance type: "+loan.getApplianceType()+" Disbursed :"+
						convertAmounts(loan.getAmount())
				+" on "+loan.getDisbursementDate());
			}
		}
	}

	private void listHomeLoans() {
		
		for(Loan l : loans) {
			if(l instanceof HomeLoan) {
				HomeLoan loan = (HomeLoan)l;
				System.out.println(loan.getAccNum()+" for Property worth: "+ 
						convertAmounts(loan.getPropertyCost())
						+" DIsbursed :"+
						convertAmounts(loan.getAmount())
						+" on "+loan.getDisbursementDate());
			}
		}
		
	}
	
	private String convertAmounts(double amount) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return nf.format(amount);
	}
	
	public List<Loan> getAll(){
		return loans;
	}
	
}


