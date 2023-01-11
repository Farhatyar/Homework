package HomeWork3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of years you have served.");
        int yearsofwork = input.nextInt();


        if (yearsofwork > 5) {
            System.out.println("please enter the amount of year salary.");
            int salary = input.nextInt();

            System.out.println("you are eligible for bonus");
            if (salary > 50000) {
                System.out.println("your bonus is 5000");
            } else {
                System.out.println("your bonus is 3000");
            }

        } else {
            System.out.println("sorry your not eligible for bonus");

        }
    }
}