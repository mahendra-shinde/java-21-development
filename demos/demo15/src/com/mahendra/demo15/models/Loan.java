package com.mahendra.demo15.models;

import java.time.LocalDate;

public abstract class Loan {
	private int accNum;
	private LocalDate disbursementDate;
	private double amount;
	private int duration;
	private float rateOfInterest;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public LocalDate getDisbursementDate() {
		return disbursementDate;
	}
	public void setDisbursementDate(LocalDate disbursementDate) {
		this.disbursementDate = disbursementDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	
	public Loan(int accNum, LocalDate disbursementDate, double amount, int duration, float rateOfInterest) {
		super();
		this.accNum = accNum;
		this.disbursementDate = disbursementDate;
		this.amount = amount;
		this.duration = duration;
		this.rateOfInterest = rateOfInterest;
	}
	public Loan() {
		
	}
}
