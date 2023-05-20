package Day_3.practice;

import java.util.Scanner;

public class DivisibleByThreeAndFive {
		
	String check(int num)
	{
		if(num%3 == 0 && num%5 == 0) { 
		return "Yes, the number is divisible by 3 and 5";
		}
		else {return "No, the number is not divisible by 3 and 5";}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		DivisibleByThreeAndFive tf = new DivisibleByThreeAndFive();
		System.out.println(tf.check(num));
		sc.close();
	}
}
