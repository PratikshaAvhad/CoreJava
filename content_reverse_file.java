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
    StringBuffer sbr=new StringBuffer();
    while((s=br.readLine())!=null)
   {
     sbr.append(s+"\n");
   }
     sbr.reverse();
     System.out.printf("%s",sbr);
 }
 catch(Exception e)
 {
   System.out.println("error="+e);
 }
}
} 