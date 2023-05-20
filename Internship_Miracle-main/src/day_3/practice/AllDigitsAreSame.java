package day_3.practice;

import java.util.Scanner;

public class AllDigitsAreSame {
	
	int check(int num)
	{	
		int temp = num%10,count = 0;
		while(num>0) 
		{
			int r = num % 10;
			if(temp!=r)
			{
				count=1;
				break;
			}
			num=num/10;
		}
		return count;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		AllDigitsAreSame ad = new AllDigitsAreSame();
		
		if(ad.check(num) == 0) {
			System.out.println("The digits all are same in the given number");
		}
		else {
			System.out.println("The digits all are not same in the given number");
		}
		
		sc.close();	
	}

}
