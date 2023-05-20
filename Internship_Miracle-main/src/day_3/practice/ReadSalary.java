package Day_3.practice;
import java.util.Scanner;

public class ReadSalary {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Salary");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Your Salary is "+num);

    }
}
