package day_3.practice;
import java.util.Scanner;

public class PerfectNumberOrNot {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int count = 0;
        for(int i = 1 ; i < num ; i++)
        {
           if(num%i == 0)
           {
               count = count + i;
           }
        }
        if(count == num)
           {
               System.out.println("Perfect Number");
           }
           else
           {
               System.out.println("Not a Perfect Number");
           }
    }

}