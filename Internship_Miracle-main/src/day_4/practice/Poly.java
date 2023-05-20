package day_4.practice;

import java.util.Scanner;

class hello
{
	void add(int a,int b) {
		System.out.println("This is from hello class");
		System.out.println(a+b);
	}
	
	void add1(int a,int b)
	{
		System.out.println(a-b);
	}
}
class hello1 extends hello
{
	void add(int a,int b)
	{
		System.out.println("This is from hello1 class");
		System.out.println(a+b);
	}
}

public class Poly {
	public static void main(String[] args)
	{
		hello1 h = new hello1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second Number");
		int b = sc.nextInt();
		sc.close();
		h.add(a,b);
		h.add1(a, b);
	}
}
