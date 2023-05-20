package day_3.practice;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the time in hours");
            int h = sc.nextInt();
            sc.close();
            System.out.println(h*3600);

    }

}
