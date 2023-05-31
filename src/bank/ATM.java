package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ATM {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.sql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","password");
		PreparedStatement ps = c.prepareStatement("");
		ResultSet rs = ps.executeQuery();
		
	
		

	}

}
