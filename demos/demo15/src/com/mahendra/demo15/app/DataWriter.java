package com.mahendra.demo15.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import com.mahendra.demo15.models.HomeLoan;


public class DataWriter {
	private static final String DATA_PATH="D:\\mydata\\";
	
	public void writeHLData(List<HomeLoan> loans) {
		try(BufferedWriter out = new BufferedWriter(new FileWriter(DATA_PATH+"homeloans.csv")))
		{
			for(HomeLoan loan: loans) {
				out.write(convertToString(loan)+"\n\r");
			}
			out.flush();
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	private String convertToString(HomeLoan loan) {
		String line = String.format("%4d, %s, %18.2f, %3d, %5.2f, %18.2f, %18.2f, %s ",
				loan.getAccNum(), loan.getDisbursementDate(), loan.getAmount(), loan.getDuration(), loan.getRateOfInterest(), loan.getDownpayment(), loan.getPropertyCost(), loan.getType()
				);
		return line;
	}
}
