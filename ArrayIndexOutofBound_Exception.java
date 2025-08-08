class Demo
{
  public static void main(String arg[])
 {
  try
  {
   int a[]=new int[5];
   System.out.println("Array Create");
   a[2]=20;
   a[12]=50;
   System.out.println("value inserted succ");
  }
  catch(Exception e)
  {
    System.out.println("Error="+e);
  }
 }
} 