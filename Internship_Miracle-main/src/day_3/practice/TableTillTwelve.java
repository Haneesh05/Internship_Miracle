package day_3.practice;
import java.util.Scanner;
public class TableTillTwelve {
	static Scanner sc = new Scanner(System.in);

	void table(int num)
	{
		for(int i = 1; i <= 10 ;i++)
		{
			System.out.println(num+" x "+i+" = "+ (num*i));
		}
	}
		public static void main(String[] args)
		{
			TableTillTwelve mt = new TableTillTwelve();
			System.out.println("Enter the value");
            for(int i = 1; i <= 12 ;i++) {
                mt.table(i);
				System.out.println("  ");
            }
		}

}

