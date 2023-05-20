package Day_3.practice;
import java.util.Scanner;

public class EvenNumbersUptoN {

    void even(int n)
    {
        for(int i = 0; i <= n ; i=i+2)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        EvenNumbersUptoN evm = new EvenNumbersUptoN();
        int n = sc.nextInt();
        sc.close();
        evm.even(n);
    }

}