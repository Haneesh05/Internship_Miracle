package day_3.practice;

import java.util.Scanner;

public class ArmstrongNumber {
    
	
	int count(int num)
    {
    	int c = 0;
    	while(num>0)
        {
    		num = num/10;
            c++;
            
        }        
    	return c;
    }
	
	
    int val(int num,int c)
    {   int sum = 0;
        while(num>0)
        {
            int r = num%10;
            sum = (int) (sum + Math.pow(r,c));
            num = num/10;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArmstrongNumber an = new ArmstrongNumber();
        int num = sc.nextInt();
        int sum  = an.val(num,an.count(num));
        sc.close();
        if(sum == num)
        {
            System.out.println("The number is Armstrong Number");
        }
        else
        {
            System.out.println("The number is not Armstrong Number");
        }
    }

}
