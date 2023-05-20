package day_2.practice;

public class withOutParameters {

	int add()
	{
		return 5 + 10;
	}
	
	String name()
	{
		return "haneesh";
	}
	
	float sum()
	{
		return 1.5f+1.2f;
	}
	
	char letter()
	{
		return 'a' ;
	}
	
	boolean isRight()
	{
		return true;
	}
	
	void namaste()
	{
		System.out.println("methods without parameters");
	}
	
	public static void main(String[] args) {
		withOutParameters wop = new withOutParameters();
		wop.namaste();
		System.out.println(wop.add());
		System.out.println(wop.sum());
		System.out.println(wop.letter());
		System.out.println(wop.name());
		System.out.println(wop.isRight());

	}

}