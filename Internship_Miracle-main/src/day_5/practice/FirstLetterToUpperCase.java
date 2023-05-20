package day_5.practice;

import java.util.Scanner;

public class FirstLetterToUpperCase {
    public static void main(String[] args) {
        FirstLetterToUpperCase v = new FirstLetterToUpperCase();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sArray = s.split("\\s");

        for(int i = 0 ; i < sArray.length ;i++)
        {
            String newArray = sArray[i].substring(0,1);
            newArray = newArray.toUpperCase();
            sArray[i] = newArray + sArray[i].substring(1);
            System.out.print(sArray[i]+" ");
        }
    }
}
