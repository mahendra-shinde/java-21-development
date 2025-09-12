package demo16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class SelectDemo {
	
	private static final String CONNECTION_STRING="jdbc:oracle:thin:@135.235.208.102:1521/freepdb1";
	private static final String SQL_QUERY = "select location_id, street_address, postal_code, city, state_province, country_id FROM locations";
	
	public static void main(String[] args) {
		List<Location> locations = new LinkedList<>();
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
			ResultSet rs = st.executeQuery(SQL_QUERY);
			while(rs.next()) {
				locations.add(convert(rs));
			}
			st.close();
			System.out.println("Connection closed !");
		}catch(SQLException ex) {
			System.out.println("Error connecting database: "+ex.getMessage());
		}
		// Display all locations
		locations.forEach(System.out::println);
	}
	
	private static Location convert(ResultSet rs) throws SQLException{
		Location location = new Location();
		location.setCity(rs.getString("city"));
		location.setLocationId(rs.getInt("location_id"));
		location.setPostalCode(rs.getString("postal_code"));
		location.setState(rs.getString("state_province"));
		location.setCountryId(rs.getString("country_id"));
		location.setStreetAddress(rs.getString("street_address"));
		return location;
	}


}
