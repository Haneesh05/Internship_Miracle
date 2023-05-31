package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertBankDetails {
	
	
		static int acc()
		{
			System.out.println("Enter the bank acc no");
			int acc_no = sc.nextInt();
			int count = 0;
			while(acc_no>0)
			{
				count++;
				acc_no%=10;
			}
			if(count!= 10)
			{
				System.out.println("Enter correct account number");
				acc();
			}
			return acc_no;
		}
	
	
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
	
		
		System.out.println("Enter the bank details");
		
		
		int acc_no = acc();
		
		
		
		System.out.println("Enter the gmail");
		String gmail = sc.nextLine();
		
		System.out.println("Enter the password");
		String password = sc.nextLine();
		
		System.out.println("Enter the account balance");
		int acc_bal = sc.nextInt();
		sc.nextLine();
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","password");
			
			PreparedStatement ps = c.prepareStatement("Insert into indianbank values(?,?,?,?)");
			
			ps.setInt(1, acc_no);
			ps.setInt(2,acc_bal);
			ps.setString(3,gmail);
			ps.setString(4,password);
			
			int j = ps.executeUpdate();
			
			if(j > 0)
			{
				System.out.println("Inserted");
			}
			else
			{
				System.out.println("Not Inserted");
			}
		}
			
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		
		}
		
		System.out.println("Done");
	
	}

}