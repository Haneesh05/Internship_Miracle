package day_5.practice;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String a = "";
		sc.close();
		
		
		for(int i = s.length()-1;i>=0;i--)
		{
			a = a + s.charAt(i);
		}
		System.out.println("The reverse string is "+a);
	}
}