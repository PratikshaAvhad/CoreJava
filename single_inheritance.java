class A
{
  A()
 {
   System.out.println("I am default constructor of A");
 }
}
class B extends A
{
  B()
 {
   System.out.println("I am default constructor of B");
 }
}
class MD
{
  public static void main(String arg[])
  {
    B ob=new B();
  }
}    