class AddDemo
{
  void add(int a,int b)
  {
    int c=a+b;
    System.out.println("addition1="+c);
  }
   void add(int a,int b,int c)
  {
    int d=a+b+c;
    System.out.println("addition2="+d);
  }
   void add(double a,double b)
  {
    double c=a+b;
    System.out.println("addition3="+c);
  }
   void add(int a,double b)
  {
    double c=a+b;
    System.out.println("addition4="+c);
  }

   public static void main(String arg[])
   {
     AddDemo ob=new AddDemo();

      ob.add(11,33);
      ob.add(22,44);
      ob.add(11,22,33);
      ob.add(22.33,2.3);
      ob.add(11,2.1);
   }
}  