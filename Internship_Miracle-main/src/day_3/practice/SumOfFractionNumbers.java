package day_3.practice;
import java.util.Scanner;

public class SumOfFractionNumbers {

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
        SumOfFractionNumbers sn = new SumOfFractionNumbers();
        int num = sc.nextInt();
        sc.close();
        System.out.println(sn.fraction(num));
    }
    
}