//Create a class Doctor(Dno, Dname, Qualification, Specialization). Write a Java program 
//to accept the details of ‘n’ doctors and display the details of doctor in ascending order by 
//doctor name. 

import java.util.*;
class Doctor
 {
    int Dno;
    String Dname, Quali, Specialization;

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of doctors: ");
        int n = sc.nextInt();
        Doctor arr[] = new Doctor[n];

        for (int i = 0; i < n; i++)
         {
            arr[i] = new Doctor();
            System.out.println("Enter Dno, Dname, Quali, Specialization:");
            arr[i].Dno = sc.nextInt();
            arr[i].Dname = sc.next();
            arr[i].Quali = sc.next();
            arr[i].Specialization = sc.next();
        }

        Arrays.sort(arr, (a, b) -> a.Dname.compareToIgnoreCase(b.Dname));

        System.out.println("\n--- Doctors in Ascending Order ---");
        for (Doctor d : arr) 
         {
            System.out.println(d.Dno + " " + d.Dname + " " + d.Quali+ " " + d.Specialization);
        }
    }
}
