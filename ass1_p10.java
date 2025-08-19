//Write a java program to calculate the sum of even numbers from an array. . 
import java.util.*; 
class demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
   System.out.println("enter limit");
    int n=sc.nextInt();
    int a[]=new int[n];
     int s=0;
    for(int i=0;i<n;i++)
       {
         a[i]=sc.nextInt();
         if(a[i]%2==0)
            s=s+a[i];
     }
      System.out.printf("sum of even numbers=%d",s);
 }
}