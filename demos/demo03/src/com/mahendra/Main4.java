package com.mahendra;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class Main4 {

	public static void main(String[] args) {
		double principal = 4857000.00;
		System.out.println("Plain Value : "+principal);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("en", "IN"));
		System.out.println("With formating : "+ nf.format(principal) );

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CANADA);
		System.out.println(df1.format(new Date()));
		
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		System.out.println(df2.format(new Date()));
		
		
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.of("IN"));
		System.out.println(df3.format(new Date()));
		
		
		
		
	}

}
