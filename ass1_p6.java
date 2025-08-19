//Write a Java program to accept a year and check if it is leap year or not.
import java.util.*; 
class demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter digit");
    int n=sc.nextInt();
     if(n%4==0)  
        System.out.printf("leap year =%d",n);
     else
        System.out.printf("not leap year =%d",n);
 }
}