package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class DqlTask1{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name");
		String fname 	= sc.nextLine();
		System.out.println("Enter the last name");
		String lname 	= sc.nextLine();
		System.out.println("Enter the username");
		String username = sc.nextLine();
		sc.close();
		String str = "Select * from employee where e_fname like'"+ fname +"%' and e_lname like '"+lname+"%' and e_username like'"+username+"%'";
		
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","password");
		PreparedStatement ps = c.prepareStatement(str);
		ResultSet rs = ps.executeQuery();  
		ResultSetMetaData rm = rs.getMetaData();
		if(rm.getColumnCount() >0)
		{
			for(int i = 1 ; i < rm.getColumnCount()+1;i++)
				{
					System.out.print(rm.getColumnName(i) + " ");
				}
					System.out.println();
			while(rs.next())
			{
				for(int i = 1 ; i < rm.getColumnCount()+1;i++)
				{
					System.out.print(rs.getString(i)+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("malli chusuko");
		}
		}
	}
	


