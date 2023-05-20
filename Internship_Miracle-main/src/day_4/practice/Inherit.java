package day_4.practice;

import java.util.Scanner;

public class Inherit {

	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b , int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args)
	{
		Inherit in = new Inherit();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second Number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		sc.close();
		in.add(a, b);
		in.add(a, b, c);
	}
	
	
}
