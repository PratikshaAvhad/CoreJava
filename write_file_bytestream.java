import java.io.*;
class Demo
{
 public static void main(String arg[])
 {
   try
   {
    FileInputStream f1=new FileInputStream("abc.txt");
    FileOutputStream f2=new FileOutputStream("pqr.txt");
     int k;
     while((k=f1.read())!=-1)
     {
      f2.write(k);
     }
     f1.close();
     f2.close();
     System.out.println("file copy succ..."); 
   } 
    catch(Exception e)
    {
      System.out.println("error="+e);
    }
  }
}
 