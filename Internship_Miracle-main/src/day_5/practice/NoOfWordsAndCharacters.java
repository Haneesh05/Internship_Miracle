package day_5.practice;

import java.util.Scanner;

public class NoOfWordsAndCharacters {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		int wordCount = 1,letterCount = 0;
		sc.close();
		if(s.length() == 0)
		{
			System.out.println("Given String is empty,enter the String again");
		}
		else
		{
			for(int i = 0; i < s.length(); i++)
			{
				if(s.charAt(i) == ' ')
				{
					wordCount++;
				}
				else
				{
					letterCount++;
				}
			}
		System.out.println("The word count is "+wordCount+" and the lette count is "+letterCount);
		}
	}
	
}
