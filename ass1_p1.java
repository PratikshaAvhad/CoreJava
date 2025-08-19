//Write a java Program to check whether given String is Palindrome or not.
import java.util.*;
class demo
{
public static void main(String arg[])
{
   Scanner sc=new Scanner(System.in);
    System.out.println("enter string");
    String s=sc.next();
    StringBuffer s1=new StringBuffer(s);
     s1.reverse();
    String s2=new String(s1);
    int k=s.compareTo(s2);
      if(k==0)
         System.out.printf("palindrom");
      else
         System.out.printf("not palindrom");
 
 }

}