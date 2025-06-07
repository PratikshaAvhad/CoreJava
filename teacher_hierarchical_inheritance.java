import java.util.*;

class collage {
    int cno;
    String cname, add;
    Scanner sc = new Scanner(System.in);

    void accept_c()
   {
        System.out.println("enter clg no");
        cno = sc.nextInt(); 
        System.out.println("enter clg name");
        cname = sc.next();
        System.out.println("enter clg add");
        add = sc.next();
    }
}

class teacher extends collage
 {
    String tname, qual;
    float sal;

    void accept_t() 
   {
        System.out.println("enter teacher name");
        tname = sc.next();
        System.out.println("enter teacher qualification");
        qual = sc.next();
        System.out.println("enter teacher salary");
        sal = sc.nextFloat(); 
    }

    void disp_t() {
        System.out.println("College no=" + cno);
        System.out.println("College name=" + cname);
        System.out.println("College add=" + add);
        System.out.println("teacher name=" + tname);
        System.out.println("teacher qualification=" + qual);
        System.out.println("teacher salary=" + sal);
    }
}

class student extends collage {
    int rno;
    String sname;
    float per;

    void accept_s() {
        System.out.println("enter student rno");
        rno = sc.nextInt(); 
        System.out.println("enter student name");
        sname = sc.next();
        System.out.println("enter student per");
        per = sc.nextFloat(); 
    }

    void disp_s() 
   {
        System.out.println("College no=" + cno);
        System.out.println("College name=" + cname);
        System.out.println("College add=" + add);
        System.out.println("student rno=" + rno);
        System.out.println("student name=" + sname);
        System.out.println("student per=" + per);
    }
}

 class MD 
{
    public static void main(String arg[]) 
{
        teacher ob = new teacher();
        student ob1 = new student();

        ob.accept_c();
        ob.accept_t();
        ob.disp_t();

        ob1.accept_c();
        ob1.accept_s();
        ob1.disp_s();
    }
}
