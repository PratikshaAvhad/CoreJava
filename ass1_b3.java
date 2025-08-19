//Write a java program to search given name into the array, if it is found then display its index otherwise display appropriate message..
import java.util.*; 
class demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string");
    String s=sc.next();
      for(int i=0;i<s.length();i++)
        {
        if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='U'||s.charAt(i)=='u'||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='E'||s.charAt(i)=='e')
       System.out.println(s.charAt(i));
    }
  }
}