//Write a java Program to calculate the sum of first and last digit of a number
import java.util.*; 
class demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter digit");
    int n=sc.nextInt();
       int b=0;
       int r=1;
       int a; 
       int s=0; 
      int d=n%10;
         b=d;      
       while(n>0)
     {
       d=n%10;
           r=(r*10)+d;
          n=n/10;
      }
      a=r%10;
      s=b+a;
    System.out.printf("sum of first and last digit =%d",s);
 }
}