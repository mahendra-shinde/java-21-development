package com.mahendra;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		double amt = 0;
		LocalDate openingDate = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount : ");
		String temp = sc.nextLine();
		amt = Double.parseDouble(temp);
		
		System.out.println("Enter Account opening date (yyyy-MM-dd): ");
		temp = sc.nextLine();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		openingDate = LocalDate.parse(temp, df);
		
		System.out.println("Amount : "+amt);
		System.out.println("Date: "+openingDate);
		
		
		
	}
}
