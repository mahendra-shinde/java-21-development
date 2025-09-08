package com.mahendra;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date; // Older DATE object

public class Main2 {

	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println("Today is " + dt);
		System.out.println("Milliseconds since 1-1-1970 00HR 00MS 00S : "+ dt.getTime());
		
		Calendar cal = Calendar.getInstance(); 
		cal.set(1990, 2, 10); // 10th March 1990
		Date dt2 = cal.getTime();
		
		System.out.println("Date : "+dt2);
		
		//// NEW DATE-TIME API
		LocalDate dt3 = LocalDate.now();	//Current system date
		LocalDate d4 = LocalDate.of(1990, 2, 10);
		System.out.println("Date : "+d4);
		
		LocalDateTime d5 = d4.atTime(2, 30);
		System.out.println("Date and Time: "+d5);

	}

}
