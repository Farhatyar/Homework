package HomeWork20;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    /*Create an arrayList of words. Remove every word that ends with “e”. */
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();

        words.add("Orange");
        words.add("Strawberry");
        words.add("Grape");
        words.add("Banana");
        words.add("Cherry");

         words.removeIf(s -> s.endsWith("e"));
        System.out.println(words);

        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String s=iterator.next();
            if(s.endsWith("e")){
                iterator.remove();
            }
        }
           System.out.println(words);
    }
}

