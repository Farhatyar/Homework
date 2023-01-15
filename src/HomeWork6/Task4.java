package HomeWork6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
         If user give more money program should return a change.
        Whenever a user done with payments program should say "Thank you for shopping!"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("item you want to buy?");
        String item = scanner.nextLine();
        System.out.println("the price of the item");
        int price = scanner.nextInt();

        int maneypaid = 0;
        do {
            System.out.println("you owe " + (price - maneypaid));
            System.out.println("How much are you paying?");
            maneypaid = scanner.nextInt();
        } while (maneypaid < price);

    if (maneypaid==price){
        System.out.println("Thank you for shopping");


    } else if (maneypaid>price) {
        System.out.println(" we owe "+(maneypaid - price));
        System.out.println("Thank you for shopping");
    }
    }}

