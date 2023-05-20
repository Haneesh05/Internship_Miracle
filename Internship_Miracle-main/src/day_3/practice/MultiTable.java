package day_3.practice;
import java.util.Scanner;

public class MultiTable {
	static Scanner sc = new Scanner(System.in);
	
	void table(int num)
	{
		for(int i = 0; i <= 10 ;i++)
		{
			System.out.println(num+" x "+i+" = "+ (num*i));
		}
	}
		public static void main(String[] args)
		{
			MultiTable mt = new MultiTable();
			System.out.println("Enter the value");
			int num = sc.nextInt();
			mt.table(num);
		}
}
