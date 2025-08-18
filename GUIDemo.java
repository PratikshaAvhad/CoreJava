import java.awt.*;
class GUIDemo extends Frame
{
  Label l1,l2,l3;
  TextField t1,t2,t3;
  Button b1,b2;
  GUIDemo()
  {
    setVisible(true);
    setSize(500,400);
    setBackground(Color.pink);
    setTitle("Login Window");
    setLocation(400,200);
    setLayout(new GridLayout(4,2));
   
    l1=new Label("enter no1");
    l2=new Label("enter no2");
    l3=new Label("addition");
    t1=new TextField(10); 
    t2=new TextField(10); 
    t3=new TextField(10);
    b1=new Button("add");
    b2=new Button("exit");
  
    add(l1);add(l2);add(l3);
    add(t1);add(t2);add(t3);
    add(b1);add(b2);
 }
 public static void main(String arg[])
{
  GUIDemo ob=new GUIDemo();
}
} 