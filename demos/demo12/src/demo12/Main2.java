package demo12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
	private static final String DATA_PATH = "D:\\git\\java-21-development\\demos\\demo12\\Products.csv";
	
	public static void main(String[] args) {
		List<Product> products = new LinkedList<Product>();
		
		// try-with-resource : auto-close "br" (Reader) after try-catch block
		try (BufferedReader br = new BufferedReader(new FileReader(DATA_PATH))){
			// Read the FIRST line 
			String line = br.readLine();
			while(line != null) {
				if(! line.startsWith("productId")) {
					String[] fields = line.split(",");
					Product p = convert(fields);
					products.add(p);
					System.out.println("Reading product : "+p);	
				}else {
					System.out.println("Header line");
				}
				
				// Read next line .....
				line = br.readLine();
			}
			System.out.println("Loading product data ... completed !");
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Now, the product sorted by Price ...");
		products.stream().sorted( (x,y) -> (int)(x.getPricePerUnit() - y.getPricePerUnit()) ).forEach(System.out::println) ;
		
	}
	
	// DTO : Data Transfer Object
	static Product convert(String[] fields) {
		Product prd = new Product();
		prd.setProductId( Integer.parseInt(fields[0]) );
		prd.setName( fields[1].trim());
		prd.setDescription(fields[2].trim());
		prd.setCategory(fields[3].trim());
		prd.setPricePerUnit(Float.parseFloat(fields[4]) );
		prd.setQuantity( Integer.parseInt(fields[5]));
		
		
		return prd;
	}

}
