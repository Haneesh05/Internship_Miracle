package Day_3.practice;

import java.util.Scanner;


public class SeriesTwoFraction {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number n:");
		int n=sc.nextInt();
		
		double sum=1.0;
		
		for(int i=2;i<=n;i++) {
			sum=sum+(double)1/i*2;
		}
		
		System.out.println("The sum of the series is:"+sum);
		
		sc.close();
	}

}
