package demo06;

public class Main {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		animals[0] = new Duck();
		animals[1] = new Duck();
		animals[2] = new Sparrow();
		animals[3] = new Sparrow();
		animals[4] = new Sparrow();
		
		for(Animal a : animals) {
			throwInWater(a);
		}
		
		// Using lambda expression to implement Flyable interface
		// Functional interface -> interface with single abstract method
		// Could also be written as:
		// class Superman implements Flyable { public void fly() { System.out.println("A Superman is flying"); } }
		// Flyable superman = new Superman();
		// Or even:
		// Flyable f = new Flyable() { public void fly() { System.out.println("A Superman is flying"); } };
		// f.fly();
		Flyable superman = ()-> System.out.println("A Superman is flying");
		superman.fly();
	}
	
	static void throwInWater(Animal a) {
		if ( a instanceof Swimable ) {
			Swimable s = (Swimable) a;
			s.swim();
		}else {
			System.out.println("Animal thrown in water, has drown !");
		}
	}
	//static void throwUp(Animal a) ....

}
