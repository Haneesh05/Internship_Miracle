package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String colName = sc.nextLine();
    String newValue = sc.nextLine();
    int e_id = sc.nextInt();
    sc.close();
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship","root","Haneesh#5");
        PreparedStatement ps = c.prepareStatement("update employee set ? = '?' where e_id = ?");
        ps.setString(1, colName);
        ps.setString(2, newValue);
        ps.setInt(3, e_id);
        int j = ps.executeUpdate();
        if(j>0)
        {
            System.out.println("Updated");
        }
        else
        {
            System.out.println("Not Updated");
        }
    }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }
}
