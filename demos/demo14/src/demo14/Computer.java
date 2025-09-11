package demo14;

public class Computer {
	public void startup() {
	}
	public void shutdown() {
	}
}

@Author(name="Mahendra", team = "dev1")
class Laptop extends Computer {
	
	@Author(name="Mahendra")
	private int storageCapacity;
	
	@Override
	public void startup(int waitTime) {
		
	}
	
	@Override
	public void updateRam() {
		
	}
}
