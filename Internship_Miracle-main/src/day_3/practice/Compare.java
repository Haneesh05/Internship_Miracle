package day_3.practice;
import java.util.Scanner;

public class Compare {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a = sc.nextInt();
		int b =sc.nextInt();
		sc.close();
		if(a>b)
		{
			System.out.println(a+" is the larger number than "+b);
		}
		else
		{
			System.out.println(b+" is the larger number than "+ a);
		}
	}
}
