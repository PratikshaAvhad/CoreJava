import java.io.*;
class Demo
{
 public static void main(String arg[])
 {
   try
   {
     FileInputStream f1=new FileInputStream("abc.txt");
     int k;
     while((k=f1.read())!=-1)
     {
      System.out.printf("%c",k);
     }
     f1.close();
   } 
    catch(Exception e)
    {
      System.out.println("error="+e);
    }
  }
}
 