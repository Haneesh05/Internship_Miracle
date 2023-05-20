package day_5.practice;

import java.util.Scanner;

public class DeleteChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String temp = s.toLowerCase();
		System.out.println("Enter the character");
		String c = sc.nextLine();
		String temp2 = c.toLowerCase();
		char a = temp2.charAt(0);
		sc.close();
		if(temp.contains(temp2))
		{
			for(int i = 0 ; i < s.length() ; i++)
			{
				if(a == temp.charAt(i))
				{
					s = s.replace(a,' ');
					System.out.println(s);
				}
			}
		}
		else
		{
			System.out.println("The string "+ s + " does not contain "+ c +" character");
		}
			
	}
	
}
