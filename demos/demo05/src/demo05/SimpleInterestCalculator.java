package demo05;

public class SimpleInterestCalculator extends InterestCalculator{

	public SimpleInterestCalculator(double principal, double rate, int duration) {
		super(principal, rate, duration);	//Pass all the arguments to base (super) class
	}

	@Override
	public double calcInterest() {
		return this.principal * (this.rate/100/12) * this.duration;
	}
	
}
