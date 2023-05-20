package day_3.practice;
import java.util.*;
public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		int n=sc.nextInt();
		sc.close();
		int space=n;
		int number=1;
		for(int i=0;i<n;i++) {
			for(int s=1;s<=space;s++) {
				System.out.print(" ");
			}
			number=1;
			for(int j=0;j<=i;j++) {
				System.out.print(number+" ");
				number=number * (i-j)/(j+1);
			}
			System.out.println();
			space--;
		}

	}

}