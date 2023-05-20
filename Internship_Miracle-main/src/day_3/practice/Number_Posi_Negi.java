package day_3.practice;
import java.util.Scanner;

public class Number_Posi_Negi {
	public static void main(String[] args)
	{	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int i = sc.nextInt();
		sc.close();
		if(i>0) {
			System.out.println("The number is Positive");
		}
		else
		{
			System.out.print("The number is Negative");
		}
	}
}
