package demo16;

import java.sql.*;

public class TestConnect {
	
	private static final String CONNECTION_STRING="jdbc:oracle:thin:@135.235.208.102:1521/freepdb1";

	public static void main(String[] args) {
		
		// Step 1 : Load JDBC Driver
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loaded ! ");
		}catch(ClassNotFoundException ex) {
			System.out.println("Unable to load JDBC Driver");
			System.out.println("1. Unsupported JDK ");
			System.out.println("2. Spelling mistake in JDBC Driver classname");
			System.out.println("3. No JDBC Driver in classpath (JAR Files missing)");
			return; /// QUIT 
		}
		
		// Step 2: Connect to Database
		
		try(Connection con = DriverManager.getConnection(CONNECTION_STRING,"hr","hr")) {
			// Step 3 : Create Statement to execute SQL Query
			Statement st = con.createStatement();
			System.out.println("Connected to Database...");
			// Step 4: Execute SQL Query and receive ResultSet
			ResultSet rs = st.executeQuery("select tname from tab");
			while(rs.next()) {
				System.out.println(" "+rs.getString("tname"));
			}
			st.close();
			System.out.println("Connection closed !");
		}catch(SQLException ex) {
			System.out.println("Error connecting database: "+ex.getMessage());
		}
	}

}
