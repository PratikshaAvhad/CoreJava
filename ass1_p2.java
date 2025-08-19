//Write a Java program which accepts three integer values and prints the maximum and minimum.
import java.util.*;
class demo
{

  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.printin("enter 3 numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
     if(a>b&a>c)
        System.out.printf("%d is maximum"+a);
     elseif(b>a&b>c)
        System.out.printf("%d is maximum"+b);
     else 
         System.out.printf("%d is maximum"+c);
    if(a<b&a<c)
          System.out.printf("%d is maximum"+a);
    elseif(b<c&b<a)
           System.out.printf("%d is maximum"+b);
    else
          System.out.printf("%d is maximum"+c); 











  }
}

 