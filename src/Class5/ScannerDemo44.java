package Class5;

import java.util.Scanner;

public class ScannerDemo44 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        scanner  => name of the class
        scan is just a variable like we create primitive variables
        = => assignment operator
        system.in=> tells the computer we want to read the data from keyboard.
         */
       // System.out.println("please Enter your age ");
        //int age=scan.nextInt();
       // System.out.println("your "+age+" years old");

      //  System.out.println("please Enter your weight");
      //  double weight=scan.nextDouble();
      //  System.out.println("your weight is "+weight+" kgs");
      //  System.out.println("Are you hungry");
      //  boolean hungry=scan.nextBoolean();
      //  System.out.println("Hungry "+hungry);//

       // System.out.println("please Enter your gender");
      //  char gender=scan.next().charAt(0); // char type of input
     //   System.out.println("your gender is "+gender);

        System.out.println("please your name");
        String name=scan.next();
        System.out.println("your name is "+name);

        scan.nextLine();
        System.out.println("please Enter your full name ");
        String fullname=scan.nextLine();
        System.out.println("your full name is "+fullname);
        scan.close();



    }
}
