package Day_3.practice;

import java.util.Scanner;
public class Arithmetic {
	
	double calculate(int n,double i,double j)
	{	
		switch(n) {
		case 1 :
			return i+j;
		case 2 :
			return i-j;
		default :
			System.out.println("Enter correct value");			
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number");
		int i = sc.nextInt();
		System.out.print("Enter the Second number");
		int j = sc.nextInt();
		System.out.println("Enter /n 1.Add 2.Substract 3.Multiply 4. Division");
		int n = sc.nextInt();
		sc.close();
		Arithmetic a = new Arithmetic();
		a.calculate(n,i,j);
		
	}

}
