package day_3.practice;
import java.util.Scanner;

public class EvenNumberUsingWhile {

    void even(int n)
    {
        int i = 0;
        while(i <= n)
        {
            System.out.println(i);
            i += 2;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        EvenNumberUsingWhile evm = new EvenNumberUsingWhile();
        int n = sc.nextInt();
        sc.close();
        evm.even(n);
    }

}