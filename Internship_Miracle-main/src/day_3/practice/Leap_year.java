package day_3.practice;
import java.util.Scanner;

class Leap_year {
	
	String check(int year)
	{
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					return "The given year is a leap year";
				}
				else {
				return "The year is not a leap year";
				}
			}return "The year is a leap year";
		}return "The year is not a leap year";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		Leap_year ly = new Leap_year();
		System.out.println(ly.check(year));
		sc.close();
	}
}
