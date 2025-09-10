package demo10;

// A class that implements "Runnable" represents a "Task" or "Work" 
public class Greetings implements Runnable {

	private String name = "Unknown";
	
	public Greetings(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Welcome "+name+" 1000 times !");
		for(int i=0;i<1000;i++) {
			System.out.println("Welcome "+name);
		}
		System.out.println("End of "+name+" welcome");
	}
}
