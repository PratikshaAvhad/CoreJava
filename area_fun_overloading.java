class AreaDemo
{
  void area(float r)
  {
    float a=3.14f*r*r;
    System.out.println("Area of Circle="+a);
  }
  void area(float l,float w)
  {
    float a=l*w;
    System.out.println("Area of Rectangle="+a);
  }
  void area(double b,double h)
  {
    double a=0.5*b*h;
    System.out.println("Area of Triangle="+a);
  }

   public static void main(String arg[])
   {
     AreaDemo ob=new AreaDemo();
       ob.area(2.4f);
       ob.area(2.1f,3.3f);
       ob.area(4.4,2.2);
  }
}
  