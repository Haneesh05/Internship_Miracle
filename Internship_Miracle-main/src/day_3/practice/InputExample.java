package day_3.practice;

import java.util.Scanner;

public class InputExample {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the salary is: ");
		int YourSalary=sc.nextInt();
		
		System.out.print("\nThe salary is: "+YourSalary);
		
		sc.close();
	}

}
