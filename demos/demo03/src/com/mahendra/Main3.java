package com.mahendra;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main3 {

	public static void main(String[] args) {
		LocalDate dt1 = LocalDate.now().plusDays(10);
		System.out.println("Date after 10 days : "+dt1);
		
		Date dt2 = Date.from(dt1.atStartOfDay(ZoneId.systemDefault()).toInstant()); 
		System.out.println("Date after 10 days : "+dt2);
	}

}
