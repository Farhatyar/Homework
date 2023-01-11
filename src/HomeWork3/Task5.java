package HomeWork3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean card = true;


        if (card) {
            System.out.println(" what is your credit balance?");
            int balance = scan.nextInt();

            if (balance > 1000) {
                System.out.println("please pay your current balance first.");
            } else {
                System.out.println("you are good to spend more");

            }

        } else {
            System.out.println("you are offered a platinum credit card.");
        }
    }

}