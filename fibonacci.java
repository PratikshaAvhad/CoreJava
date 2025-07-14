import java.util.*;
class demo
{
  void series()
  {
    int f=0,s=1,t,i;
    System.out.printf("series=%d%d",f,s);
    for(i=0;i<20;i++)
    {
      t=f+s;
      System.out.printf(" %d",t);
      f=s;
      s=t;
     }
  }
 public static void main(String arg[])
  {
    demo ob=new demo();
      ob.series();
   }
}  