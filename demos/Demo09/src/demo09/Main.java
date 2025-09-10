package demo09;

import java.text.NumberFormat;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) {
		double n1, n2;
		char opr;
		NumberFormat nf = NumberFormat.getNumberInstance();
		
		if(args.length<3) {
			System.out.println("Incorrect Syntax, requires 3 arguments");
			System.out.println("java demo09.Main <num1> <OPERATOR> <num2> ");
			return;
		}
		
		try {
		n1 = Double.parseDouble(args[0]);	// Take 1st Argument as double
		}catch(NumberFormatException ne) {
			System.out.println("Invalid Number "+args[0]);
			System.out.println("Assuming first number is ZERO !");
			n1 =0;
		}
		
		try {
//		n2 = Double.parseDouble(args[2]);	// Take 3rd Argument as double
		n2 = nf.parse(args[2]).doubleValue();
		}catch(ParseException ex) {
			System.out.println("Invalid Number "+args[2]);

			System.out.println("Assuming second number is ZERO !");
			n2 =0;
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
	

}
