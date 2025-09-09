package demo05;

public abstract class InterestCalculator {
	protected double principal;
	protected double rate;
	protected int duration;
	
	public InterestCalculator(double principal, double rate, int duration) {
		super();
		this.principal = principal;
		this.rate = rate;
		this.duration = duration;
	}
	
	abstract public double calcInterest();
}
