package demo05;

public class Main2 {

	public static void main(String[] args) {
		Customer cust1 = new  Customer(1001, "Gaurang", "Chakroborti");
		Customer cust2 = new Customer(1002, "Geeta","Bali");
		System.out.println("Customer 1:" + cust1.custId() + " "+cust1.firstName()+" "+cust1.lastName() );
		
		
		System.out.println(cust2);
		
		
	}

}
