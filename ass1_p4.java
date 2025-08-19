//Write a Java program to display Fibonacci series
import java.util.*; 
class demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter numbers");
    int n=sc.nextInt();
       int f=0;
       int s=1; 
      System.out.printf("Fibonacci series %d%d",f,s);
      for(int i=1;i<=n;i++)
       {
          int t=f+s;
             System.out.printf("%d",t);
           s=t;
           f=s;        
       }
 }
}