package day_3.practice;

import java.util.Scanner;

public class FibonacciSeries {
	
		void fib(int num) {
		int a=0;
    	int b=1;
    	int c;	
    	System.out.println("The series is: ");
    	System.out.print(a+" "+b+" ");	
    	for(int i=2;i<=num;i++) {
    		c=a+b;
    		a=b;
    		b=c;
    		System.out.print(c+" ");
    	}
    	
    }
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		FibonacciSeries fb = new FibonacciSeries();
		System.out.print("Enter the value of n:");
		int num=sc.nextInt();
		
		fb.fib(num);
		
		sc.close();
	};

}
