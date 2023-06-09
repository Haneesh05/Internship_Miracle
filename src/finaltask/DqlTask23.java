package JDBC;

/*
 * SQL commands
  * CREATE TABLE `employee` (
  `e_id` int NOT NULL,
  `e_fname` char(20) DEFAULT NULL,
  `e_lname` char(20) DEFAULT NULL,
  `e_age` int DEFAULT NULL,
  `e_role` char(20) DEFAULT NULL,
  `e_phone` bigint DEFAULT NULL,
  `e_email` varchar(20) DEFAULT NULL,
  `e_username` varchar(20) DEFAULT NULL,
  `e_password` varchar(20) DEFAULT NULL,
  `add_by` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`e_id`)
);*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class DqlTask2 {

	static Scanner sc = new Scanner(System.in);

	static String role()
	{
		String e_role = sc.nextLine();
		if(e_role.equalsIgnoreCase("trainee") || e_role.equalsIgnoreCase("hr") || e_role.equalsIgnoreCase("trainer"))
		{
			return e_role;
		}
		else
		{
			System.out.println("Enter the role again");
			role();
		}
		return e_role;

	}


	static void switched(int e_id,String role) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","Haneesh#5");

		System.out.println("""
				enter the value for 1.Insert\s
				2.Update
				3.Delete
				4.View
				5.View your profile
				""");
		int s = sc.nextInt();
		sc.nextLine();

		switch(s) {
			case 1:
				if (role.equalsIgnoreCase("trainer") || role.equalsIgnoreCase("hr") || role.equalsIgnoreCase("trainee")) {
					System.out.println("Enter the employee details");

					System.out.println("Enter the employee id");
					int e_id1 = sc.nextInt();

					sc.nextLine();

					System.out.println("Enter the employee first name");
					String e_fname = sc.nextLine();

					System.out.println("Enter the employee last name");
					String e_lname = sc.nextLine();

					System.out.println("Enter the employee age");
					int e_age = sc.nextInt();
					sc.nextLine();

					System.out.println("Enter the employee role");
					String e_role = role();

					System.out.println("Enter the employee phone number");
					String phnum = sc.nextLine();
					long e_phone = Long.parseLong(phnum);

					String e_email = e_fname.substring(0, 1).toLowerCase() + e_lname.toLowerCase() + "@intern.com";
					String e_username = e_fname.substring(0, 1).toLowerCase() + e_lname.toLowerCase();
					String e_password = e_fname.substring(0, 2).toLowerCase() + e_lname.substring(0, 2).toLowerCase() + phnum.substring(5);
					PreparedStatement ps = c.prepareStatement("Insert into employee values(?,?,?,?,?,?,?,?,?,?)");

					ps.setInt(1, e_id1);
					ps.setString(2, e_fname);
					ps.setString(3, e_lname);
					ps.setInt(4, e_age);
					ps.setString(5, e_role);
					ps.setLong(6, e_phone);
					ps.setString(7, e_email);
					ps.setString(8, e_username);
					ps.setString(9, e_password);
					ps.setInt(10, e_id);

					int j = ps.executeUpdate();

					if (j > 0) {
						System.out.println("Inserted");
					} else {
						System.out.println("Not Inserted");
					}
				} else {
					System.out.println("You can only insert if you are a trainer or HR.");
				}
				break;

			case 2:
				{
				if (role.equalsIgnoreCase("trainer") || role.equalsIgnoreCase("hr")) {
					System.out.println("enter the element you want to update");
					String str1 = sc.nextLine();
					System.out.println("enter the value for the element");
					String str2 = sc.nextLine();


					PreparedStatement ps2 = c.prepareStatement("update employee set ? = ? where e_id = ?");
					ps2.setString(1, str1);
					ps2.setString(2, str2);
					ps2.setInt(3, e_id);
				} else {
					System.out.println("You dont have access to update");
				}
				break;
				}
			case 3:
				if(role.equalsIgnoreCase("hr"))
				{
					e_id = sc.nextInt();
					PreparedStatement ps3 = c.prepareStatement("delete from employee where e_id"+e_id);
				}
				else
				{
					System.out.println("You dont have access to delete");
				}
				break;

			case 4:
				if(role.equalsIgnoreCase("hr"))
				{
					System.out.println("Employees under you: ");
					PreparedStatement ps4 = c.prepareStatement("select * from employee where add_by =?");
					ps4.setInt(1, e_id);
					ResultSet rs4 = ps4.executeQuery();
					ResultSetMetaData rm4 = rs4.getMetaData();
					while(rs4.next())
					{
						for(int i = 1 ; i < rm4.getColumnCount()+1 ; i++)
						{
							System.out.print(rs4.getString(i)+" ");
						}
					}
				}
				else
				{
					System.out.println("You don't have access to view the details");
				}
			break;

			case 5:
				PreparedStatement ps5 = c.prepareStatement("select * from employee where e_id = "+ e_id);
				ResultSet rs5 = ps5.executeQuery();
				ResultSetMetaData rm5 = rs5.getMetaData();
				while (rs5.next())
				{
					for (int i = 1; i < rm5.getColumnCount(); i++) {
						System.out.println(rs5.getString(i));
					}
				}
				System.exit(0);
		}
	}


	static void login() throws Exception
	{
		System.out.println("enter your employee id");
		int e_id = sc.nextInt();
		System.out.println("enter your password");
		sc.nextLine();
		String password = sc.nextLine();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","Haneesh#5");
		PreparedStatement ps = c.prepareStatement("select * from employee where e_id = ?");
		ps.setInt(1, e_id);
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rm = rs.getMetaData();
		while(rs.next())
		{
			if(!password.equals(rs.getString(9)))
			{
				System.out.println("enter the correct password");
					login();
				}
				else
				{
					String role = rs.getString(5);
					switched(e_id,role);
					System.out.println(role);
				}
			}
		}


	public static void main(String[] args) throws Exception {
		login();




	}

}
