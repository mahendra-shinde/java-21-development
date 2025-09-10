package demo10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main3 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<Double> result1 = executor.submit(new FactorialTask(4));
		Future<Double> result2 = executor.submit(new FactorialTask(5));
		
		try {
		System.out.println("Factorial of 4 is : "+ result1.get(10,TimeUnit.SECONDS));
		System.out.println("Factorial of 5 is : "+ result2.get(10, TimeUnit.SECONDS));
		}catch(TimeoutException ex2) {
			System.out.println("Timed out !");
		}catch(InterruptedException ex3) {
			System.out.println("Interrupted !!!");
		}catch(ExecutionException ex) {
			ex.printStackTrace();
		}
		
		try {
			executor.awaitTermination(10, TimeUnit.SECONDS);
			executor.shutdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
