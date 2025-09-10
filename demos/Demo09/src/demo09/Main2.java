package demo09;

import java.text.NumberFormat;
import java.text.ParseException;

public class Main2 {

	public static void main(String[] args) {
		double n1, n2;
		char opr;
		
		
		if(args.length<3) {
			System.out.println("Incorrect Syntax, requires 3 arguments");
			System.out.println("java demo09.Main2 <num1> <OPERATOR> <num2> ");
			return;
		}
		
		
		n1 = Main2.convertToDouble(args[0]);
		
		n2 = Main2.convertToDouble(args[2]);
		
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
	
	static double convertToDouble(String num) {
		try {
		NumberFormat nf = NumberFormat.getNumberInstance();
		return nf.parse(num).doubleValue();
		}catch(ParseException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Invalid number, replaced with ZERO !");
			return 0;
		}
	}
	

}
