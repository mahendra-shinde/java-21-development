package com.mahendra;

import java.text.NumberFormat;
import java.util.Locale;

public class Main4 {

	public static void main(String[] args) {
		double principal = 4857000.00;
		System.out.println("Plain Value : "+principal);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("en", "IN"));
		System.out.println("With formating : "+ nf.format(principal) );
		// Custom formatting for Indian number system (lakhs/crores)
		String formatted = formatIndianNumber(principal);
		System.out.println("Indian format (lakhs/crores): ₹" + formatted);

	}

	// Method to format numbers in Indian number system (lakhs/crores)
	public static String formatIndianNumber(double number) {
		String numStr = String.format("%.2f", number);
		String[] parts = numStr.split("\\.");
		String intPart = parts[0];
		String decPart = parts[1];

		StringBuilder sb = new StringBuilder();
		int len = intPart.length();
		if (len > 3) {
			sb.append(intPart.substring(0, len - 3));
			for (int i = len - 3; i > 0; i -= 2) {
				sb.append(",");
				if (i - 2 > 0) {
					sb.append(intPart.substring(i - 2, i));
				} else {
					sb.append(intPart.substring(0, i));
				}
			}
			sb.append(intPart.substring(len - 3));
		} else {
			sb.append(intPart);
		}
		return sb.toString() + "." + decPart;
	}

}
