package demo12;

import java.io.IOException;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("This is Standard Output !");
		System.err.println("This is Standard Error !");

		System.out.println("Enter your name: ");
		byte[] buffer = new byte[100]; /// Create a buffer for input
		try {
			int length = System.in.read(buffer);
			String name = new String(buffer, 0, length);
			System.out.println("Number of BYTES entered: " + length);
			System.out.println("Input converted to String: " + name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
