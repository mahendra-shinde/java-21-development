package com.mahendra;

public class Main {

	public static void main(String[] args) {
		String str1 = new String("Hello World"); 
		String str2 = "Hello world";  //String literals
		
		System.out.println("Are they both same ? "+ (str1.equals(str2)));  // Case sensitive
		System.out.println("Are they both same ? "+ (str1.equalsIgnoreCase(str2))); // Case insensitive
		
		String str3 = "Jan, Feb, Mar, Apr";
		String months[] = str3.split(",");
		for(int i = 0; i < months.length; i++ ) {
			System.out.println(months[i].trim().toUpperCase());
		}
		
		System.out.println("Alice  ".trim().toUpperCase());
	}

}

