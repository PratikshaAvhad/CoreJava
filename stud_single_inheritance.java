import java.util.*;
class collage
{
  int cno;
  String cname,add;
  Scanner sc=new Scanner(System.in);
  
  void accept_c()
  {
    System.out.println("enter clg no");
     cno=sc.nextInt();
    System.out.println("enter clg name");
     cname=sc.next(); 
    System.out.println("enter clg address");
     add=sc.next(); 
  }
} 
class student extends collage
{
  int rno;
  String name;
  float per;

  void accept_s()
  {
    System.out.println("enter student rno");
     rno=sc.nextInt();
    System.out.println("enter student name");
     name=sc.next(); 
    System.out.println("enter student per");
     per=sc.nextFloat(); 
  }
  void disp()
  {
   System.out.println("collage no="+cno);
   System.out.println("collage name="+cname);
   System.out.println("collage add="+add);
   System.out.println("student rno="+rno);
   System.out.println("student name="+name);
   System.out.println("student per="+per);
  }
}
class MD
{
  public static void main(String arg[])
  {
    student ob=new student();
     ob.accept_c();
     ob.accept_s();
     ob.disp();
   }
}
