package HomeWork22;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task4 {
    /*Create the collection that will store single uniques Objects of a String
     type in which order is preserved.Write a logic to concatenate all string
      from the collection.
     */
    public static void main(String[] args) {
        Set<String> words=new LinkedHashSet<>();
        words.add("Omid");
        words.add("is");
        words.add("a");
        words.add("genius");
        words.add("boy");

        String allWords="";

        for(String word:words){
            allWords+=" "+word;
        }
        System.out.println(allWords);
    }
}
