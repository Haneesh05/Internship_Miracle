package day_5.practice;

import java.util.Scanner;

public class StringLength {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		char a [] = s.toCharArray();
		int count =0;
		for(char c : a) 
		{
			count++;
		}
		System.out.println("The length of the String is " + count);
		
		sc.close();
	}
	
}
