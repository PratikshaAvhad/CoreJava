//Create a class Teacher(Tid, Tname, Designation, Salary, Subject). Write a Java program 
//to accept the details of ‘n’ teachers and display the details of teacher who is teaching 
//Java Subject.(Use array of Object)

import java.util.Scanner;
class Teacher
 {
    int Tid;
    String Tname, Designation, Subject;
    double Salary;

    public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        Teacher arr[] = new Teacher[n];

        for (int i = 0; i < n; i++)
       {
            arr[i] = new Teacher();
            System.out.println("Enter Tid, Tname, Designation, Salary, Subject:");
            arr[i].Tid = sc.nextInt();
            arr[i].Tname = sc.next();
            arr[i].Designation = sc.next();
            arr[i].Salary = sc.nextDouble();
            arr[i].Subject = sc.next();
        }

        System.out.println("\n--- Teachers Teaching Java ---");
        for (Teacher t : arr)
           {
            if (t.Subject.equalsIgnoreCase("Java"))
            {
                System.out.println(t.Tid + " " + t.Tname + " " + t.Designation + " " + t.Salary + " " + t.Subject);
            }
        }
    }
}
