package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class DqlTask1
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter the first name");
		String fname = sc.nextLine();
		System.out.println("Enter the second name");
		String lname = sc.nextLine();
		System.out.println("Enter the username");
		String username = sc.nextLine();
		int count = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","password");
		PreparedStatement ps = c.prepareStatement("select * from employee");
		ResultSet rs = ps.executeQuery();  
		ResultSetMetaData rm = rs.getMetaData();
		
		for(int i = 1 ; i < rm.getColumnCount()+1;i++)
				{
					System.out.print(rm.getColumnName(i) + " ");
				}
					System.out.println();
			while(rs.next())
			{
				String str1 = rs.getString(2);
				String str2 = rs.getString(3);
				String str3 = rs.getString(8);
				for(int i = 1 ; i < rm.getColumnCount()+1;i++)
				{
					if(str1.startsWith(fname) && str2.startsWith(lname) && str3.startsWith(username))
					{
						System.out.print(rs.getString(i)+" ");
						count++;
					}
				}
				System.out.println();
			}
			if(count == 0)
			System.out.println("The value doesnot exist in the table");
			
		}
		
		}

	


