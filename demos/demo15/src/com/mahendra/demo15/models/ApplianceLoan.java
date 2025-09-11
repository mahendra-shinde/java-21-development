package com.mahendra.demo15.models;

import java.time.LocalDate;

public class ApplianceLoan extends Loan{
	private String applianceType;
	private String storeName;
	public String getApplianceType() {
		return applianceType;
	}
	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public ApplianceLoan(int accNum, LocalDate disbursementDate, double amount, int duration, float rateOfInterest,
			String applianceType, String storeName) {
		super(accNum, disbursementDate, amount, duration, rateOfInterest);
		this.applianceType = applianceType;
		this.storeName = storeName;
	}
	
	
	
}
