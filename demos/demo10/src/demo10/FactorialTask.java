package demo10;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Double>{
	
	private double num;
	
	public FactorialTask(double num) {
		this.num = num;
	}
	
	
	@Override
	public Double call() throws Exception {
		double factorial = 1;
		while(num >= 1) {
			factorial  *= num;
			num --;
		}
		return factorial;
	}
}
