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
     if(k>='A' && k<='Z')        //65-90
        f2.write(k+32);
     else if(k>='a' && k<='z')   //97-122
        f2.write(k-32);
     else if(k>='0' && k<='9')
        f2.write('*');
     else
        f2.write(k);
    }
     f1.close();
     f2.close();
     System.out.println("copy succ...");
  }
  catch(Exception e)
  {
    System.out.println("error="+e);
  }
}
}

  