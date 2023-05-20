package day_3.practice;
import java.util.Scanner;

public class SumOfEvenNumbers {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n =sc.nextInt();
		sc.close();
		int count = 0;
		for(int i = 0 ; i<n ;i=i+2)
		{
			count = count + i;
		}
		sc.close();
		System.out.println("The sum of the "+" even numbers"+count);
	}
	
}