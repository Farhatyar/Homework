package HomeWork20;

import HomeWork17.CreditCard;

import java.util.LinkedList;

public class CardTester {
     public static void main(String[] args) {

        LinkedList<Card> name=new LinkedList<>();
        name.add(new Card(0.3,"Credit card"));
        name.add(new Card(0.5,"Debit card"));
        name.add(new Card(0.4,"Visa card"));

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i).cardType);
            System.out.println(name.get(i).interest);
            name.get(i).open();
            name.get(i).charges();
        }
        System.out.println("_______________________");

        for (Card card:name) {
            System.out.println(card.cardType);
            System.out.println(card.interest);
            card.open();
            card.charges();
        }

        }
    }
