package day_3.practice;

public class PrimeNumbersTillTen {
	
	int prime(int num)
	{	
		int count=0;
		for(int i = 2 ; i < num; i++)
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
		PrimeNumbersTillTen pm = new PrimeNumbersTillTen();
		System.out.println("The Prime Numbers are");
		for(int i = 2; i <= 10 ; i++)
		{
			if(pm.prime(i) == 0 ) 
			{
				System.out.println(i);
			}
				
		}
	}
	
}
