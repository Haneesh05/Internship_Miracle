package exercise;

import java.util.Scanner;

class Area{
	
double returnArea(double l, double b)
{
return l*b;
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length of the rectangle ");
double l = sc.nextInt();
System.out.println("Enter the breadth of the rectangle");
double b = sc.nextInt();
sc.close();
Area a = new Area();
System.out.println(a.returnArea(l,b));
}

}
