package day_5.practice;

import java.util.Scanner;

public class Palindrome {

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String");
			String s = sc.nextLine();
			String a = "";
			sc.close();
			
			
			for(int i = s.length()-1;i>=0;i--)
			{
				a = a + s.charAt(i);
			}
			
						
			if(s.equals(a))
			{
				System.out.println("The given String is a palindrome.");
			}
			else
			{
				System.out.println("The given String is not a palindrome.");
			}
		}
}
