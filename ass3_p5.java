//Create a package Mathematics with two classes Maximum and Power. Write a java 
//program to accept two numbers from user and perform the following operations on it: 
//a. Find Maximum of two numbers. 
//b. Calculate the power(XY);

import java.util.*;
import Mathematics.*;

class MainProg 
{
    public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Maximum m = new Maximum();
        Power p = new Power();

        System.out.println("Maximum = " + m.max(x, y));
        System.out.println(x + "^" + y + " = " + p.pow(x, y));
    }
}

 