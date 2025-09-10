package demo10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {

	// Concurrency API Allows Parallelism and reuse of Thread
	public static void main(String[] args) {
		
		Greetings greet1 = new Greetings("XI Jinping");
		Greetings greet2 = new Greetings("Vladimir Putin");
		Greetings greet3 = new Greetings("Donald Trump");
		Greetings greet4 = new Greetings("Georgia Meloni");
		
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(greet1);
		service.submit(greet2);
		service.submit(greet3);
		service.submit(greet4);
		System.out.println(":::::: Number of Active THread :::::: "+Thread.activeCount());
		service.shutdown();
		
	}

}
