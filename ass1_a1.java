//Write a java Program to calculate the sum of first and last digit of a number

import java.util.*; 
class demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter digit");
    int n=sc.nextInt();
     int f=0;
       for(int i=2;i<n;i++)
        {
           if(i%n==0)
              f=1;
             break;
        }
    if(f==1)
        System.out.printf("%d is not prime number",n);
    else 
        System.out.printf("%d is  prime number",n);
}
}