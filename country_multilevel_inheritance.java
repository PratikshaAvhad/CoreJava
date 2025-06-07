import java.util.*;
class continent
{
  String contname;
  Scanner sc=new Scanner(System.in);

  void accept_cont()
  {
    System.out.println("enter continent name");
     contname=sc.next();
  }
} 
class country extends continent
{
  String countryname;
  void accept_country()
  {
    System.out.println("enter country name");
     countryname=sc.next();
  }
} 
class state extends country
{
  String statename,place;
  void accept_state()
  {
    System.out.println("enter state name");
     statename=sc.next();
    System.out.println("enter place name");
     place=sc.next();
  }
  void disp()
  {
    System.out.println("continent name="+contname);
    System.out.println("country name="+countryname);
    System.out.println("State name="+statename);
    System.out.println("place name="+place);  
   } 
}
class MD
{
  public static void main(String arg[])
 {
   state ob=new state();
    ob.accept_cont();
    ob.accept_country();
    ob.accept_state();
    ob.disp();
 }
} 