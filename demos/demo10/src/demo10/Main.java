package demo10;

public class Main {

	// Multi threading 
	public static void main(String[] args) {
		
		Greetings greet1 = new Greetings("XI Jinping");
		Greetings greet2 = new Greetings("Vladimir Putin");
		Greetings greet3 = new Greetings("Donald Trump");
		Greetings greet4 = new Greetings("Georgia Meloni");
		
		// Thread is a "Worker" and Runnable object is "Work" / "Task"
		Thread t1 = new Thread(greet1);
		Thread t2 = new Thread(greet2);
		Thread t3 = new Thread(greet3);
		Thread t4 = new Thread(greet4);
		
		t2.setPriority(Thread.MAX_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println(":::::: Number of Active THread :::::: "+Thread.activeCount());
		
	}

}
