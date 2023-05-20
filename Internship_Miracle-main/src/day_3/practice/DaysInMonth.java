package day_3.practice;
import java.util.Scanner;

public class DaysInMonth {
	static Scanner sc= new Scanner(System.in);
	
	int check(String month)
	{
		month = month.toLowerCase();
		if(month == "february")
			return 28;
		else if(month.equals("january") || month.equals("march") || month.equals("may") || month.equals("july") || month.equals("august") || month.equals("october") || month.equals("december") )
				return 31;
		else if(month.equals("april") || month.equals("june") || month.equals("septmeber") || month.equals("november"))
				return 30;
		return 0;
	}
	
	
	public static void main(String[] args)
	{
		DaysInMonth dim = new DaysInMonth();
		System.out.println("Enter the Month Name");
		String month = sc.nextLine();
		if(dim.check(month) == 0)
			System.out.println("Check the spelling or enter the correct name of the month");
		else
			System.out.println("There are "+ dim.check(month) +" days in the "+month+" month");
	}
	
}
