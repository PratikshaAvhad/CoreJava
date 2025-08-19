//Write a Java program to display characters from A to Z using loop. 
import java.util.*; 
class demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
   
     int ch=65;
    for(int i=0;i<26;i++)
       {
        System.out.printf("\t%c",ch);
         ch++;
     }
 }
}