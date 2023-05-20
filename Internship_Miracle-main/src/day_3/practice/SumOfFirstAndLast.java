package day_3.practice;

import java.util.Scanner;

public class SumOfFirstAndLast {
	
	int first (int num)
	
	{	
		int val = num%10;		
		return val;
	}
	
	int last(int num)
	{	
		while(num >= 10)
		{
			num = num/10;
		}
		return num;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SumOfFirstAndLast fl = new SumOfFirstAndLast();
    	System.out.print("Enter the number :");
    	int num=sc.nextInt();
    	System.out.println("The first digit in "+num+" is "+fl.first(num));
    	System.out.println("The last digit in"+num+" is "+fl.last(num));
    	System.out.println("The sum of first and last digit is:"+(fl.first(num)+fl.last(num)));
    	sc.close();
    }
}
