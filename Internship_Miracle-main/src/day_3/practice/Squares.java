package day_3.practice;

import java.util.Scanner;
public class Squares {
	static Scanner sc = new Scanner(System.in);
	
	void table()
	{
		for(int i = 0; i <= 20 ;i++)
		{
			System.out.println((i*i));
		}
	}
		public static void main(String[] args)
		{
			Squares mt = new Squares();
			mt.table();
		}
}


