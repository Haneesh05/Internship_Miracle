package day_3.practice;
import java.util.Scanner;

public class FactorialOfANumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int sum = 1;
        for(int i = 1 ; i <= num ;i++)
        {
            sum *= i;
        }
        System.out.println(sum);
    }

}
