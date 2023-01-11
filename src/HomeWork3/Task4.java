package HomeWork3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your city");
        String city=input.nextLine();

        System.out.println("Enter the temperature");

        double temperature=input.nextDouble();

      double Cl=(0.5556)*(temperature-32);

        System.out.println("the temperature in "+city+" is "+Cl);
    }
}
