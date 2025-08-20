import java.awt.*;
class demo extends Frame
{
  Label l1;
  demo()
  {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
    l1=new Label("cdj college");
     add(l1);
   l1.setBackground(Color.pink);
  }
   public static void main(String arg[])
  {
    new demo();
  }
}
 