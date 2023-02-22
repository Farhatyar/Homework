package HomeWork20;

import java.util.ArrayList;

public class Task4 {
    /*Create an arrayList of drinks.
     If any drink has letter “a” or “e” replace it with water. */
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Tea");
        drinks.add("Juice");
        drinks.add("Coffee");
        drinks.add("Orange juice");

       for (String drink:drinks) {

            if(drink.contains("a")|| drink.contains("e")) {
                drinks.set(drinks.indexOf(drink), "Water");
            }

        }
        System.out.println(drinks);


    }
}