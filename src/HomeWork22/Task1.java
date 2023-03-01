package HomeWork22;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    /*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc. )
Retrieve all keys and values from a Best Buy map using EntrySet.*/
    public static void main(String[] args) {

        Map<Integer,String> items=new HashMap<>();
        items.put(123,"Tv");
        items.put(456,"Printer");
        items.put(789,"Computer");

        Set<Map.Entry<Integer,String>> itemsSet=items.entrySet();

        for (Map.Entry<Integer,String> item:itemsSet){
            System.out.println(item.getKey()+" "+item.getValue());
        }
    }
}
