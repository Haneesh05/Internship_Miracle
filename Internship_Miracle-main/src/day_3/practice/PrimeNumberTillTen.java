package day_3.practice;
import java.util.Scanner;

public class PrimeNumberTillTen {

    int prime(int num)
    {
        int count = 0;
        for(int i = 2; i < num; i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrimeNumberTillTen pn = new PrimeNumberTillTen();
        sc.close();
        if(pn.prime(num) == 0)
        {
            System.out.println("The number is Prime");
        }
        else
        {
            System.out.println("The number is not prime");
        }

    }

}
