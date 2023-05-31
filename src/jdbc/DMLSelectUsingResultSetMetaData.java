package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DMLSelectUsingResultSetMetaData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","password");
		PreparedStatement ps = c.prepareStatement("Select * from employee");
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rm = rs.getMetaData();
		for(int i = 1 ; i < rm.getColumnCount();i++)
		{
			System.out.print(rm.getColumnName(i) + " ");
		}
		System.out.println();
		while(rs.next())
		{
			for(int i = 1 ; i < rm.getColumnCount();i++)
			{
				System.out.print(rs.getString(i)+" ");
			}
			System.out.println();
		}
		
		
	}

}
