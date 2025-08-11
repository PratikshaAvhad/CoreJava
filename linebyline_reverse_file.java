import java.io.*;
class Demo
{
 public static void main(String arg[])
 {
  try
  {
    FileReader f1=new FileReader("abc.txt");
    BufferedReader br=new BufferedReader(f1);
     String s="";
    while((s=br.readLine())!=null)
   {
     StringBuffer sbr=new StringBuffer(s);
       sbr.reverse();
     System.out.printf("%s\n",sbr);
   }
 }
 catch(Exception e)
 {
   System.out.println("error="+e);
 }
}
} 