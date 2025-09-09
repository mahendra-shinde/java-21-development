package demo06;

public class Duck extends Animal implements Swimable, Flyable{

	@Override
	public void fly() {
		System.out.println("Duck started flying...");
	}

	@Override
	public void swim() {
		System.out.println("Duck started swimming");
	}
	
}
