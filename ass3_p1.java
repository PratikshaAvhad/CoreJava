//Create abstract class Shape with abstract method area().Write a Java program to 
//calculate are of Rectangle and Triangle.(Inherit Shape class in classes Rectangle and 
//Triangle )

abstract class Shape
 {
    abstract void area();
 }

class Rectangle extends Shape 
{
    int l, b;
    Rectangle(int l, int b) 
     { 
       this.l = l; this.b = b; 
      }
    void area()
     { 
      System.out.println("Rectangle Area = " + (l * b)); 
     }
}

class Triangle extends Shape
  {
    int b, h;
    Triangle(int b, int h)
     { 
      this.b = b; this.h = h;
     }
    void area()
    {
      System.out.println("Triangle Area = " + (0.5 * b * h));
    }
}

class Main
 {
    public static void main(String[] args)
    {
        Shape r = new Rectangle(10, 5);
        Shape t = new Triangle(6, 8);
        r.area();
        t.area();
    }
}
 