package day_3.practice;
import java.util.Scanner;

public class NumberOfOccurences {

    void check (int num, int digit)
    {   int time = 0;
        while(num>0)
        {
            int r = num%10;
            if(r == digit)
            {
                time++;
            }
                num /= 10;
        }
        System.out.println(time);
    }

    public static  void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        NumberOfOccurences no = new NumberOfOccurences();
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the digit");
        int digit = sc.nextInt();
        sc.close();
        no.check(num,digit);
    }
}
