import java.util.*;
class emp
{
  int eno;
  String ename;
  float sal;

  void accept()
 {
   Scanner sc=new Scanner(System.in);
    System.out.println("enter emp no");
      eno=sc.nextInt();  
    System.out.println("enter emp name");
      ename=sc.next();      
    System.out.println("enter emp sal");
      sal=sc.nextFloat();      
 } 
  void disp()
  {
    System.out.printf("emp no=%d",eno);   
    System.out.printf("emp name=%s",ename);  
    System.out.printf("emp sal=%f",sal); 
  }

   public static void main(String arg[])
  {
    emp ob=new emp();
     ob.accept();
     ob.disp();
  }
} 