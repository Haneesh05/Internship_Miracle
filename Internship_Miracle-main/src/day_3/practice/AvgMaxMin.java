package day_3.practice;
import java.util.Scanner;
public class AvgMaxMin {

 public static void main(String[] args) {
  int sum=0;
  int max=0;
  int min=0;
  Scanner sc = new Scanner(System.in);
  for(int i=1;i<=10;i++) {
   System.out.print(i+":");
   int a =sc.nextInt();
   sum=sum+a;
   if(max<a) {
    max=a;
   }
   if(i==1) {
    min=a;
   }
   if(min>a) {
    min=a;
   }
  }
        System.out.println("avg is:"+(sum/10));
        System.out.println("max is:"+max);
        System.out.println("min is:"+min);
        sc.close();
 }

}