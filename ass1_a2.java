//Write a Java program which accepts three integer values and prints the maximum and 
//minimum.

import java.util.*;
class Demo
{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter 1st nos");
   int a=sc.nextInt();
  System.out.println("enter 2nd nos");
   int b=sc.nextInt();
  System.out.println("enter 3rd nos");
   int c=sc.nextInt();
  
  if(a>b && a>c)
   {
    System.out.println("max no is="+a);  
   }   
  else if(b>a && b>c)
  {   
    System.out.println("max no is="+b);   
  }
  else
   {
    System.out.println("max no is="+c);
   }   
 }
} 