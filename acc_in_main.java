import java.util.*;
class emp
{
  int eno;
  String ename;
  float sal;

  void accept(int eno1,String ename1,float sal1)
 {
   eno=eno1;
   ename=ename1;
   sal=sal1;
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

    Scanner sc=new Scanner(System.in);

      System.out.println("enter emp no");
      eno=sc.nextInt();  
    System.out.println("enter emp name");
      ename=sc.next();      
    System.out.println("enter emp sal");
      sal=sc.nextFloat(); 

    ob.accept(eno,ename,sal);
    ob.disp();
 }
} 