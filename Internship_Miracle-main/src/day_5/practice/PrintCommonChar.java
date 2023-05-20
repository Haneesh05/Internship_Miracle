package day_5.practice;
import java.util.Scanner;
public class PrintCommonChar {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the string 1:");
		String str1 = sc.nextLine();
		System.out.print("enter the string 2:");
		String str2 = sc.nextLine();

        String commonChars = commonCharacters(str1, str2);

        System.out.println("Common characters: " + commonChars);
    }

    public static String commonCharacters(String str1, String str2) {
        StringBuilder commonChars = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);

            if (str2.contains(String.valueOf(c)) && !commonChars.toString().contains(String.valueOf(c))) {
                commonChars.append(c);
            }
        }
        return commonChars.toString();
    }
}


