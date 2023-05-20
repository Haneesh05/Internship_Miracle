package day_5.practice;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class DeleteCommonChar {

    String delCommon(String s1,String s2)
    {
        StringBuilder sb = new StringBuilder();
        int i = 0 ;
        while (i < s1.length())
        {
            char newChar = s1.charAt(i);
            if(!s2.contains(String.valueOf(newChar)))
            {
                sb.append(newChar);
            }
            i++;
        }
        return sb.toString();
    }

     String delCommon2(String s1,String s2)
    {
        StringBuilder sb = new StringBuilder();
        int i = 0 ;
        while (i < s2.length())
        {
            char newChar = s2.charAt(i);
            if(!s1.contains(String.valueOf(newChar)))
            {
                sb.append(newChar);
            }
            i++;
        }
        return sb.toString();
    }



    public static void main(String[] args) {

        DeleteCommonChar d = new DeleteCommonChar();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String");
        String s2 = sc.nextLine();

        System.out.println("The removed common characters from String1 is "+d.delCommon(s1,s2)+" and String2 is "+d.delCommon2(s1,s2));

    }
}
