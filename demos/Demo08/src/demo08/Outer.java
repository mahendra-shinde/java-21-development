package demo08;

public class Outer {
	//static nested class
	static class StaticNested {
        void display() {
            System.out.println("Inside static nested class");
            /// JVM Creates an Anonymous Inner class (Referred as <Outclass>$1.class)
            /// Create an Object from that Anonymous class
            /// Then assign this object to Variable of type "Runnable" (Interface)
            // AT COMPILE TIME, A CLASS created Outer$StaticNested$1.class
            Runnable r1 = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Running in anonymous class");
                }
            };
            // Same as above code (Line# 11 to 16)
            Runnable r2 = () -> {System.out.println("Running a thread");};
        }
    }
	class NonStaticNested{
		
	}
}
