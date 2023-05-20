package day_2.practice;

public class withParameters {

	int add(int a, int b) {
		return a+b;
	}
	
	String name(String firstName,String secondName)
	{
		return firstName+secondName;
	}
	
	char c (char i)
	{
		return i;
	}
	
	float floats(float a , float b)
	{
		return a*b;
	}
	
	void hemlo(String h)
	{
		System.out.println(h);
	}
	
	public static void main(String[] args)
	
	{
		withParameters wp = new withParameters();
		wp.hemlo("withParameters");
		System.out.println(wp.add(10, 20));
		System.out.println(wp.c('Z'));
		System.out.println(wp.floats(1.50f,0.80f));
		System.out.println(wp.name("Haneesh ", "Bandaru"));
	}
	
}
