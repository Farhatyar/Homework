package HomeWork6;

import java.util.Scanner;

public class Task4A {
    public static void main(String[] args) {
        /*Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
         If user give more money program should return a change.
        Whenever a user done with payments program should say "Thank you for shopping!"
         */
        Scanner scan = new Scanner(System.in);


        System.out.println("Do you want to buy sth");
        boolean buyItem=scan.nextBoolean();
        System.out.println("What is the price of the item");
        int price= scan.nextInt();

        int moneyPaid=0;

        while (buyItem){
            if (moneyPaid<price){
                System.out.println("You owe : "+(price-moneyPaid));
                System.out.println("How much do you want to pay?");
                moneyPaid= moneyPaid+ scan.nextInt();
            }else if (moneyPaid==price){
                System.out.println("Thank you for shopping");
                break;
            }else {
                System.out.println("Here is your change of : "+ (moneyPaid-price)+"$");
                System.out.println("Thank you for shopping");
                break;
            }

        }
    }
}