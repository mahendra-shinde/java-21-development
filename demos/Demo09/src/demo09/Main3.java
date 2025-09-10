package demo09;

import java.text.NumberFormat;
import java.text.ParseException;

public class Main3 {

	public static void main(String[] args) {
		double n1, n2;
		char opr;
		
		
		if(args.length<3) {
			System.out.println("Incorrect Syntax, requires 3 arguments");
			System.out.println("java demo09.Main3 <num1> <OPERATOR> <num2> ");
			return;
		}
		
		try {
		n1 = Main3.convertToDouble(args[0]);
		n2 = Main3.convertToDouble(args[2]);
		}catch(ParseException ex) {
			System.out.println("One of the numbers is invalid !");
			System.out.println("Try again !");
			return;
		}
		
		opr = args[1].trim().charAt(0);		// Take 1st character from 2nd argument as operator
		
		switch(opr) {
		case '+':
			System.out.println("Addition: "+ ( n1 + n2)  );
			break;
		case '-':
			System.out.println("Subtraction: "+  (n1 - n2 ) );
			break;
		case 'x':
			System.out.println("Multiplication: "+ (n1*n2) );
			break;
		case '/':
			System.out.println("Division: "+ (n1/n2) );
			break;
		default:
			System.out.println("Invalid Operation "+opr);
		}
		
	}
	
	static double convertToDouble(String num) throws ParseException{
		
		NumberFormat nf = NumberFormat.getNumberInstance();
		return nf.parse(num).doubleValue();
		
	}
	

}
