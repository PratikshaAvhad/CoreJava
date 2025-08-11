import java.io.*;
class Demo
{
  public static void main(String arg[])
 {
  try
  {
    FileReader f1= new FileReader("abc.txt");
    BufferedReader br=new BufferedReader(f1);
    String s="";
    while((s=br.readLine())!=null)
   {
     System.out.printf("%s\n",s);
    }
  }
  catch(Exception e)
  {
    System.out.println("Error="+e);
  }
 }
} 