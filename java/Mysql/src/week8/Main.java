package week8;
import java.sql.*;


public class Main {
	
	
	

	public static void main (String[] args)throws Exception {
		Class.forName("org.mysql.jdbc.Driver");
		String url =  "jdbc:mysql://localhost/classicmodels"; 
		final String USER = "newuser";
		final String PASS = "password";
		Connection conn = DriverManager.getConnection(url, USER, PASS);

		String SelectSQL = "Select * FROM employees";
		Statement stmt = conn.createStatement();
		ResultSet result =  stmt.executeQuery(SelectSQL);
		while(result.next())
			            {
			            	String name = result.getString("firstName");
			            	String email  = result.getString("email");
			            	System.out.println(name +" | " + email);
			            }
		}


}
