package day_3.practice;
import java.util.Scanner;

public class Pass_check {
	
	
	String check(int marks)
	{
		if(marks>=60)
		{
			if(marks>=90)
			{
				return "A";
			}
			else if(marks >= 80 && marks < 90) {
				return "B";
			}
			else if(marks >= 70 && marks < 80) {
				return "C";
			}
			else if(marks >=60 && marks < 70) {
				return "D";
			}
		}
		return "Fail";
	}
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks of the Student");
	int marks = sc.nextInt();
	Pass_check pc = new Pass_check();
	System.out.println(pc.check(marks));
	sc.close();
	
	}
	
}
