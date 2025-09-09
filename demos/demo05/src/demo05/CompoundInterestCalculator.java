package demo05;

public class CompoundInterestCalculator extends InterestCalculator{

	public CompoundInterestCalculator(double principal, double rate, int duration) {
		super(principal, rate, duration);
	}

	@Override
	public double calcInterest() {
		double futureValue = this.principal * (Math.pow(1 + this.rate/100/12 , this.duration)); 
		return futureValue - principal;
	}
}	
