package day_3.practice;

import java.util.Scanner;

public class FactSeries{
	
	static int fact(int i) {
		
		int product=1;
		
		for(int j=2;j<=i;j++) {
    		product=product*j;
    	}
		
		return product;
    }
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		System.out.print("\nEnter the value of x:");
		int n=sc.nextInt();	
		int x=sc.nextInt();
		
		double sum=1.0;
		for(int i=1;i<=n;i++) {
			sum=sum+(double)(x*i)/fact(i);
		}
		
		System.out.println("The sum of the series is: "+sum);
		
		sc.close();
		
	}

}
