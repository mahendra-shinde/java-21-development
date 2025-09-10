package demo08;

public class GrandParent {
	
	public Parent getParent() {
		return new Parent();
	}
	
	
	
	class Parent{
		
		public Child getChild() {
			return new Child();
		}
		
		class Child{
			class Doll {
				
			}
		}
	}
}
