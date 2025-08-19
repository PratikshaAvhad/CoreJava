//Write a java Program to accept employee name from a user and display it in reverse order

import java.util.*; 
class demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter employee name");
    String s=sc.next();
      StringBuffer s1=new StringBuffer(s);
       s1.reverse();
       System.out.print(s1);
    }
}