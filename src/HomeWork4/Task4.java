package HomeWork4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month=scan.next();
        if (month.equalsIgnoreCase("june") ||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("august")){
            System.out.println("you were born in Summer");
        }else if (month.equalsIgnoreCase("september") ||month.equalsIgnoreCase("october")||month.equalsIgnoreCase("november")){
            System.out.println("you were born in fall");
        }else if (month.equalsIgnoreCase("december") ||month.equalsIgnoreCase("january")||month.equalsIgnoreCase("february")){
            System.out.println("you were born in winter");
        }else if (month.equalsIgnoreCase("march") ||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("may")){
            System.out.println("you were born in Spring");
        }else {
            System.out.println("invalid input");
        }
        scan.close();
    }
}