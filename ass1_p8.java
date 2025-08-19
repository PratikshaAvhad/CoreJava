//Write a Java program to accept two numbers using command line argument and calculate 
//addition, subtraction, multiplication and division. 
import java.util.*; 
class demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 2 numbers");
    int n=sc.nextInt();
    int n1=sc.nextInt();  
    int  c=n+n1;
    int  d=n-n1;
    int  e=n*n1;
    int  f=n/n1;
    
     System.out.printf("\nAddition=%d",c);
     System.out.printf("\nsubstraction=%d",d);
     System.out.printf("\nmultipliction=%d",e);
     System.out.printf("\ndiv=%d",f);
       
 }
}