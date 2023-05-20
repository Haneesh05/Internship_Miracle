package day_3.practice;
import java.util.Scanner;

public class Menu_calculator {
	static Scanner sc = new Scanner(System.in);
	int calculate(int num) {
		int val=0,new_val = 0;
		for(int i = 0;i<num;i++)
		{
			System.out.println("Enter the price of item "+i);
			new_val = sc.nextInt();
			val = val + new_val;
		}
		return val;
	}
	
	public static void main(String[] args)
	{
		Menu_calculator mc = new Menu_calculator();
		System.out.println("Enter the number of items");
		int num = sc.nextInt();
		System.out.println("The Bill amount is"+mc.calculate(num));
	}

}
