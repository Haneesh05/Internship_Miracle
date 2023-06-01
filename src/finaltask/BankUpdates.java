package bank;

import java.sql.*;
import java.util.Scanner;



class InSufficientBalanceException extends Exception
{
     public InSufficientBalanceException(String withdraw)
    {
        super(withdraw);
    }
}

class Depo extends Exception
{
    public Depo(String deposit)
    {
        super(deposit);
    }
}

class Error extends Exception{
    public Error(String incorrect)
    {
        super(incorrect);
    }
}

public class BankUpdates
{	static int chances = 0;
    static void login() throws ClassNotFoundException, SQLException, InSufficientBalanceException, Error, Depo {
    	
        if (chances < 3) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship", "root", "password");
            System.out.println("Enter the account number");
            Scanner sc = new Scanner(System.in);
            long acc_no = sc.nextLong();

            PreparedStatement ps = c.prepareStatement("Select * from indianbank");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rm = rs.getMetaData();

            int count = 0;

            while (rs.next()) {
                for (int i = 1; i < rm.getColumnCount(); i++) {
                    if (acc_no == rs.getLong(1))
                        count++;
                }
            }

            if (count == 0) {
                System.out.println("You have entered incorrect acc no");
                chances++;
                System.out.println("Remaining chances you have are" + (3 - chances));
                login();
            }


            System.out.println("Enter the password");
            sc.nextLine();
            String password = sc.nextLine();
            PreparedStatement ps1 = c.prepareStatement("select * from indianbank where acc_no ="+acc_no);
            ResultSet rs1 = ps1.executeQuery();
            while ((rs1.next())){
                String cPassword = rs1.getString(4);
                if(!password.equals(cPassword))
                {
                    System.out.println("The password you have entered is incorrect,please login with correct password");
                    chances++;
                    System.out.println("You have "+(3-chances)+"tries remaining");
                    login();
                }
                int balance = rs1.getInt(2);
                bank(acc_no,password,balance);
            }

        }
        else
        {
            System.out.println("You have entered your credentials wrong for 3 times please try again later");
            System.exit(0);

        }
    }

    static void bank(long acc_no,String password,int balance) throws InSufficientBalanceException, Error, Depo, SQLException, ClassNotFoundException {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to " +
                "1.Deposit " +
                "2.Withdraw " +
                "3.Balance " +
                "4.Transfer " +
                "5.Exit ");
        int s = sc.nextInt();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/internship", "root", "password");

        switch (s) {
            case 1 -> {
                System.out.println("Enter the amount you want to deposit");
                int credit = sc.nextInt();
                if (credit < 500) {
                    throw new Depo("Enter more than 500 rupees");
                } else {
                    balance = credit + balance;
                    PreparedStatement ps = c.prepareStatement("update indianbank set acc_bal="+balance+" where acc_no = "+acc_no);
                    ps.executeUpdate();
                    PreparedStatement ps1 = c.prepareStatement("select * from indianbank where acc_no=" + acc_no+";");
                    ResultSet rs = ps1.executeQuery();

                    while (rs.next()) {
                        int balance2 = rs.getInt(2);
                        bank(acc_no, password, balance2);
                    }
                }
            }

            case 2 -> {
                System.out.println("Enter the amount you want to withdraw");
                int debit = sc.nextInt();
                if (debit >= balance) {
                    throw new InSufficientBalanceException("Balance is not sufficient");
                } else {
                    balance -= debit;
                    PreparedStatement ps = c.prepareStatement("update indianbank set acc_bal= " + balance + " where acc_no=" + acc_no);
                    ps.executeUpdate();
                    PreparedStatement ps1 = c.prepareStatement("select * from indianbank where acc_no=" + acc_no);
                    ResultSet rs = ps1.executeQuery();
                    System.out.println("The remaining balance is " + balance);

                    while (rs.next()) {
                        int balance3 = rs.getInt(2);
                        bank(acc_no, password, balance3);
                    }
                }
            }
            case 3 -> {
                System.out.println("Your balance is " + balance);
                bank(acc_no, password, balance);
            }
            case 4 -> {
                System.out.println("Enter the password to initiate transfer");
                sc.nextLine();
                String password1 = sc.nextLine();
                if (password1.equals(password)) {
                    System.out.println("Please enter the receivers account number");
                    long receiversAccNo = sc.nextLong();
                    PreparedStatement ps = c.prepareStatement("select acc_no from indianbank");
                    ResultSet rs = ps.executeQuery();
                    ResultSetMetaData rm = rs.getMetaData();
                    int count = 0;
                    while (rs.next()) {
                        for (int i = 0; i < rm.getColumnCount(); i++) {
                            if (receiversAccNo == rs.getLong(1)) {
                                count++;
                            }
                        }
                    }
                    if (count == 0) {
                        System.out.println("Account number invalid, Please enter a valid account number");
                        System.exit(0);
                    }
                    PreparedStatement ps5 = c.prepareStatement("select * from indianbank where acc_no=" + receiversAccNo);
                    ResultSet rs5 = ps5.executeQuery();
                    while (rs5.next()) {
                        int receiversAccBal = rs5.getInt(2);

                        System.out.println("Enter the amount you want to transfer ");
                        int amount = sc.nextInt();
                        if (amount > balance) {
                            throw new InSufficientBalanceException("Balance is not sufficient");
                        }
                        receiversAccBal += amount;
                        balance -= amount;
                        PreparedStatement ps6 = c.prepareStatement("update indianbank set acc_bal=" + receiversAccBal + " where acc_no=" + receiversAccNo);
                        ps6.executeUpdate();
                        PreparedStatement ps7 = c.prepareStatement("update indianbank set acc_bal=" + balance + " where acc_no=" + acc_no);
                        ps7.executeUpdate();
                        bank(acc_no, password, balance);
                    }

                } else {
                    System.out.println("You have entered incorrect credentials,please check your account number and password");
                    System.exit(0);
                }


            }
            case 5 -> {
                System.out.println("Thank you using our services");
                System.exit(0);
            }
            default -> {
                System.out.println("Enter the correct input give input " + s + " is Invalid");
                bank(acc_no, password, balance);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InSufficientBalanceException, Error, Depo {


    login();
    }
}
