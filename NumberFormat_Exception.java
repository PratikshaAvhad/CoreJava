class Demo
{
  public static void main(String arg[])
 {
  try
  {
    String s="44r";
    int n=Integer.parseInt(s);
    System.out.println("number="+n);
  }
  catch(Exception e)
  {
    System.out.println("Error="+e);
  }
 }
} 