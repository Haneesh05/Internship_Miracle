package bank;

import java.util.Scanner;

@SuppressWarnings("serial")
class InSufficientBalanceException extends Exception
{
   	public InSufficientBalanceException(String withdraw)
    {
        super(withdraw);
    }
}

@SuppressWarnings("serial")
class Depo extends Exception
{
   	public Depo(String deposit)
    {
        super(deposit);
    }
}

@SuppressWarnings("serial")
class Error extends Exception
{
	public Error(String incorrect)
    {
        super(incorrect);
    }
}




public class Bank {
	static int balance =10000;
    static void deposit() throws Depo
    {
        throw new Depo("Enter more than 500 rupees");
    }

    static void withdraw() throws InSufficientBalanceException
    {
        throw new InSufficientBalanceException("Balance is not sufficient");
    }

    static void balance() throws Error {
        throw new Error("Enter the correct username and password");
    }
    
    static void find() throws Exception
    {
    	Scanner sc = new Scanner(System.in);
    	int s = sc.nextInt();
        switch (s) {
        case 1 -> {
            System.out.println("Enter the amount you want to deposit");
            int val1 = sc.nextInt();
            if (val1 < 500) {
                deposit();
            } else {
                balance += val1;
                System.out.println("The updated balance is " + balance);
            }
        }
        case 2 -> {
            System.out.println("Enter the amount you want to withdraw");
            int val2 = sc.nextInt();
            if (val2 > balance) {
                withdraw();
            } else {
                balance -= val2;
                System.out.println("The remaining balance is " + balance);
            }
        }
        case 3 -> {
            sc.nextLine();
            System.out.println("Enter the username");
            String username;
            username = sc.nextLine();
            System.out.println("Enter the password");
            String password = sc.nextLine();
            if (username.equals("Default") && password.equals("123456789")) {
                System.out.println("The current balance is " + balance);
            } else {
                balance();
            }
        }
        case 4 -> {System.out.println("Thank you using our services");
        			find();}
        default -> System.out.println("Enter the correct input give input " + s + " is Invalid");
        
    }
        sc.close();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value to " +
                "1.Deposit " +
                "2.Withdraw " +
                "3.Balance " +
                "4.Exit ");
        
        find();
        sc.close();

    }
}