import java.util.*;
class InvalidPancard extends Exception
{
  public String toString()
  {
    return "PAN card number is invalid";
  }
}
class pandemo
{
  public static void main(String arg[])
   { 
     try
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter pan number");
       String s1=sc.next();

       if(s1.length()!=10)
         throw new InvalidPancard();

       for(int i=0;i<5;i++)
        {
          if(!(s1.charAt(i)>='A'&&s1.charAt(i)<='Z'))
             throw new InvalidPancard();
        }

       for(int i=5;i<9;i++)
        {
          if(!(s1.charAt(i)>='0'&&s1.charAt(i)<='9'))
             throw new InvalidPancard();
        }

       if(!(s1.charAt(9)>='A'&& s1.charAt(9)<='Z'))
            throw new InvalidPancard(); 

       System.out.println("valid Pan card="+s1);   
    
     }catch (Exception e)
      {
        System.out.println("Error="+e);
       }  
    }
}
 