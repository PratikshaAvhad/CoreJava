//Write a java program to display following pattern: 
//5 
//4 5 
//3 4 5 
//2 3 4 5 
//1 2 3 4 5 


class demo
{

public static void main(String arg[])
{
      int ch=1;
   for(int i=1;i<=4;i++)
    {

     for(int j=1;j<=i;j++)
       {
            
          int a=ch%2;
       System.out.printf("%d",a);
             ch=ch+1;
        }
      System.out.print("\n");  

 
}
}
}