package Day_3.practice;
import java.util.Scanner;

public class Number_Even_Odd {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num%2 == 0)
		{
			System.out.print("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
		sc.close();
	}
}
