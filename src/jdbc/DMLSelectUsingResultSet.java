package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DMLSelectUsingResultSet {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","password");
		PreparedStatement ps = c.prepareStatement("Select * from employee");
		ResultSet rs = ps.executeQuery();  //getting the employee table details
		while(rs.next())
		{
			for(int i = 1 ; i <= 9;i++)
			{
				System.out.print(rs.getString(i) + " ");
			}
			System.out.println("\n");
		}
	
	
	
	

	}
}