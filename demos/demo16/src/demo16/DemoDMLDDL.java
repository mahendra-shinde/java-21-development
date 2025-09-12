package demo16;

import java.sql.*;

public class DemoDMLDDL {
	
	private static final String CONNECTION_STRING="jdbc:oracle:thin:@135.235.208.102:1521/freepdb1";
	private static final String DDL_QUERY = "CREATE TABLE products (productId number primary key, pname varchar2(20), price number(15,2))";
	private static final String DML_QUERY = "INSERT into products (productId, pname, price) values (?, ?, ?)";
	
	private static final String CHECK_TABLE = "select tname from tab where tname='products'" ;
	
	public static void main(String[] args) {
		Connection con = null;
		
		try {
			// Skip the Class.forName // Skip Manual ClassLoading !
			con = DriverManager.getConnection(CONNECTION_STRING,"hr","hr");
			Statement st = con.createStatement();
			if(! checkTable(st)) {
				System.out.println("Creating the missing table !");
			  st.execute(DDL_QUERY); /// DDL Queries DO NOT return RESULT SET or even NUMBER OF ROWS	
			}
			saveProduct(con, 102, "HP X360", 83000D);
			saveProduct(con, 103, "View Sonic", 20000);
						
		}catch(SQLException ex) {
			System.out.println("SQL Error "+ ex.getMessage());
			ex.printStackTrace();
		}finally {
			try {
			con.close();
			}catch(SQLException ex) {
				System.out.println("Unable to close connections : "+ex.getMessage());
			}
		}

	}
	
	private static boolean checkTable(Statement st)throws SQLException {
		return st.execute(CHECK_TABLE);
	}
	
	private static int saveProduct(Connection con, int productId, String name, double price)throws SQLException
	{
		PreparedStatement ps = con.prepareStatement(DML_QUERY);
		ps.setInt(1, productId);
		ps.setString(2, name);
		ps.setDouble(3, price);
		int rows = ps.executeUpdate(); // Returns number of records created !
		return rows;
	}

}
