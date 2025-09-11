package com.mahendra.demo15.models;

import java.time.LocalDate;

public class HomeLoan extends Loan {
	private double propertyCost;
	private double downpayment;
	private InterestType type;

	public double getPropertyCost() {
		return propertyCost;
	}
	public void setPropertyCost(double propertyCost) {
		this.propertyCost = propertyCost;
	}
	public double getDownpayment() {
		return downpayment;
	}
	public void setDownpayment(double downpayment) {
		this.downpayment = downpayment;
	}
	public InterestType getType() {
		return type;
	}
	public void setType(InterestType type) {
		this.type = type;
	}
	public HomeLoan(int accNum, LocalDate disbursementDate, double amount, int duration, float rateOfInterest,
			double propertyCost, double downpayment, InterestType type) {
		super(accNum, disbursementDate, amount, duration, rateOfInterest);
		this.propertyCost = propertyCost;
		this.downpayment = downpayment;
		this.type = type;
	}
	
	
	
}
