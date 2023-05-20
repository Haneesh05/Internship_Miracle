package day_3.practice;
import java.util.Scanner;

public class SumOfFractionFactorials {


    int factorial(int num)
    {
        int sum = 1;
        for(int i = 1 ; i <= num ;i++)
        {
            sum *= i;
        }
        return sum;

    }
        double fraction(double num)
    {
        double sum = 0,r;
        for(double i = 1 ; i < num;i++)
        {
            r =(1/i);
            sum = sum + r;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SumOfFractionFactorials sn = new SumOfFractionFactorials();
        int num = sc.nextInt();
        sc.close();
        System.out.println(sn.fraction(sn.factorial(num)));
    }
}
