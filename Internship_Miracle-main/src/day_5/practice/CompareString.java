package day_5.practice;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First String");
	String a = sc.nextLine();
	System.out.println("Enter the Second String");
	String b = sc.nextLine();
	sc.close();
	int count = 0;
	if(a.length() != b.length())
	{
		System.out.println("They are not same");
	}
	else
	{
		for(int i = 0 ; i < a.length();i++)
		{
			if(a.charAt(i) != b.charAt(i))
			{
				System.out.println("They are not same");
			}
			else
			{
				count++;
			}
		}
		
	}
	if(count == a.length())
		System.out.println("They are same");
	}
}
