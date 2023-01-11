package HomeWork4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("1st Num : ");
        double a= scan.nextDouble();
        System.out.print("2nd Num : ");
        double b= scan.nextDouble();
        System.out.print("3rd Num : ");
        double c= scan.nextDouble();

        if (a!=b) {
            if (a!=c){
                if (b!=c) {

                    if (a > b && a > c) {
                        System.out.println("The largest number is " + a);
                    } else if (b > a && b > c) {
                        System.out.println("The largest number is " + b);
                    } else if (c > b && c > b) {
                        System.out.println("The largest number is " + c);
                    }
                }else{
                    System.out.println("Please enter three distinct numbers");
                }
            }else{
                System.out.println("Please enter three distinct numbers");
            }


        }else{
            System.out.println("Please enter three distinct numbers");
        }

    }
}