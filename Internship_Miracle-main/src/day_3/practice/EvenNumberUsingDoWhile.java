package Day_3.practice;
import java.util.Scanner;

public class EvenNumberUsingDoWhile {

    void even(int n)
    {
        int i = 0;
        do {
            i += 2;
            System.out.println(i);
        }
        while(i<=n);

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
