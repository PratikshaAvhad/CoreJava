import java.io.*;
class Demo
{
 public static void main(String arg[])
 {
  try
  {
    FileInputStream f1=new FileInputStream("abc.txt");
    int k,c1=0,c2=0,c3=0,c4=0,c5=0;
    while((k=f1.read())!=-1)
    {
     if(k>='A' && k<='Z')
        c1++;
     else if(k>='a' && k<='z')
        c2++;
     else if(k>='0' && k<='9')
        c3++;
     else if(k=='\n')
        c4++;
     else
        c5++;
    }
     System.out.printf("\n upper case=%d",c1);
     System.out.printf("\n lower case=%d",c2);
     System.out.printf("\n digits case=%d",c3);
     System.out.printf("\n lines case=%d",c4);
     System.out.printf("\n symbals case=%d",c5);
  }
  catch(Exception e)
  {
    System.out.println("error="+e);
  }
}
}

  