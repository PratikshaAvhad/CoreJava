//sum of digit
import java.util.*; 
class demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter digit");
    int n=sc.nextInt();
       
       int s=0; 
      while(n>0)
     {
      int d=n%10;
          s=s+d;
          n=n/10; 
     }
    System.out.printf("sum of digit =%d",s);
 }
}