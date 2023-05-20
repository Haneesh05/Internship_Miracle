package day_3.practice;
import java.util.Scanner;

public class SumOfAlternativeDigits
{
    int count(int num)
    {
        int ct =0;
        while(num>0)
        {
            ct++;
            num = num/10;
        }
          return ct;
    }

    int evenValue (int ct,int num)
    {

        int even = 0;
        while(num>0)
        {
            int r = num%10;
            if(ct%2==0)
            {
                even = even + r;
            }
            ct++;
            num = num/10;

        }
        return even;
    }

    int oddValue(int count,int num) {
        int  odd = 0;
        while (num > 0)
        {
            int r = num % 10;
            if (count % 2 != 0) {
                odd = odd + r;
            }
            count++;
            num = num/10;
        }
        return odd;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SumOfAlternativeDigits ad = new SumOfAlternativeDigits();
        int num = sc.nextInt();
        sc.close();
        int d = ad.count(num);
        System.out.println("The sum of alternative numbers is at odd places " + ad.oddValue(d,num));
        System.out.println("The sum of alternative numbers is at even places " + ad.evenValue(d,num));
    }

}
