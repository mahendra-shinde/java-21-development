package demo10;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Account {
	private String accNum;
	private String customerName;
	private String accType;
	private LocalDate openingDate;
	private double balance;
	
	public Account(String accNum, String customerName, String accType, LocalDate openingDate, double balance) {
		super();
		this.accNum = accNum;
		this.customerName = customerName;
		this.accType = accType;
		this.openingDate = openingDate;
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccNum() {
		return accNum;
	}

	public String getAccType() {
		return accType;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		return "Account : "+this.getAccNum() + ", Customer: "+this.getCustomerName()+" Balance: "+ nf.format(balance);
	}
}
