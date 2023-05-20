package exercise;
import java.util.Scanner;

class Average
{

int avg(int i, int j ,int k)
{
return (i+j+k)/3;	

}
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	int j = sc.nextInt();
	int k = sc.nextInt();
	sc.close();
	Average a = new Average();
	System.out.println(a.avg(i,j,k));
}
}