package day_3.practice;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			if(i!=1) {
				for(int k=i;k>=2;k--) {
					System.out.print(k+" ");
				}
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}