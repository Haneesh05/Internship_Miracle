package day_5.practice;

import java.util.Scanner;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the string:");
		String s = sc.nextLine();
		String s1= s.toLowerCase();
		int consonantsCount=0;
		int vowelsCount=0;
		int numbers=0;
		int specialCharacters=0;
		for(int i=0;i<s.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				vowelsCount++;
			}
			else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z') {
				consonantsCount++;
			}
			else if(s1.charAt(i)<=9) {
				numbers++;
			}
			else {
				specialCharacters++;
			}
		}

		System.out.println("no of vowels:"+vowelsCount);
		System.out.println("no of consonants:"+consonantsCount);
		System.out.println("no of integers:"+numbers);
		System.out.println("no of special characters:"+specialCharacters);


	}

}
