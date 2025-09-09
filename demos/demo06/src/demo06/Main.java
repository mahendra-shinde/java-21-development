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
	}
	
	static void throwInWater(Animal a) {
		if ( a instanceof Swimable ) {
			Swimable s = (Swimable) a;
			s.swim();
		}else {
			System.out.println("Animal, you thrown in water is now drown !");
		}
	}

}
