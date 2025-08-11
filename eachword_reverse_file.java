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
     String s1[]=s.split(" ");
     for(int i=0;i<s1.length;i++)
    {
     StringBuffer sbr=new StringBuffer(s1[i]);
       sbr.reverse();
     System.out.printf("%s",sbr);
    }
     System.out.println();
   }
 }
 catch(Exception e)
 {
   System.out.println("error="+e);
 }
}
} 