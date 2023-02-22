package HomeWork20;

import java.util.ArrayList;

public class Task1 {
    /* 1) Create an ArrayList that will store 5 names into it.
          Find out whether the given ArrayList is empty or not?
          Check whether the specific name is present in an ArrayList or not?
          Find the size of your arrayList and print all values from that
*/
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Ahmad");
        names.add("Omar");
        names.add("Omid");
        names.add("Fallah");
        names.add("Yousuf");

        System.out.println(names.isEmpty());

        System.out.println(names.contains("Khan"));
        System.out.println(names.size());

        System.out.println(names);


        for (String name:names) {
            System.out.print(name+" ");

        }

    }
}

