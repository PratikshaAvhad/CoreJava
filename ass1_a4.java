// Write a Java program to display Fibonacci series.

import java.util.*;
class Demo
{
 void series()
 {
   int f=0,s=1,t,i;
   System.out.printf("series=%d",f,s);
   for(i=0;i<10;i++)
  {
    t=f+s;
    System.out.printf(" %d",t);
    f=s;
    s=t;
  }
 }
public static void main(String arg[])
{
 Demo ob=new Demo();
   ob.series();
}
}