// Single line Comment
package com.mahendra;

// Blueprint for creating instances (Objects) later
class Greeting {
   public void greet(String name){
	System.out.println("Hello "+name);
   }
}

public class Main{
   public static void main(String args[]){

	// Create an instance from the Blueprint (Class)
      Greeting gt = new Greeting();
      gt.greet("Mahendra");
   }
}

