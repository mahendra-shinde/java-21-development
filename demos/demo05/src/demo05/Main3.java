package demo05;

public class Main3 {

	public static void main(String[] args) {
		InterestCalculator calc = new SimpleInterestCalculator(120000, 7.8, 60);
		double interest = calc.calcInterest();
		System.out.println("Simple interest: "+interest);
		
		calc = new CompoundInterestCalculator(120000, 7.8, 60);
		System.out.println("Compound interest: "+ calc.calcInterest());
		
	}

}
