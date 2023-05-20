package day_3.practice;

import java.util.Scanner;

public class Factorial {
	
	static int fact(int n) {
		int p=1;
		
		for(int i=2;i<=n;i++) {
			p*=i;
		}
		return p;
	}
	
	public static void main(){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		
		System.out.println("The factorial of the value n is: "+fact(n));
		sc.close();
	}
}
