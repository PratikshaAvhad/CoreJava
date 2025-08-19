//Write a Java program to accept a number from command prompt and generate 
//multiplication table of a number.
import java.util.*; 
class demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter numbers");
    int n=sc.nextInt();
      System.out.println("mutiplication tale");
      for(int i=1;i<=10;i++)
       {
          int c=n*i;
         System.out.printf(" \n%d ",c);
       }
 }
}