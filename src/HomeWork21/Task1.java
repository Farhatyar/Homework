package HomeWork21;

import java.util.LinkedHashSet;

public class Task1 {
    /*Create a Set of cities in which you want to make sure that insertion
    order is maintained.  Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {
        LinkedHashSet<String> cities =new LinkedHashSet<>();
        cities.add("London");
        cities.add("Ottawa");
        cities.add("Paris");
        cities.add(("Abbot"));
        cities.add("Rome");
        cities.add("Florence");
        cities.add("Ankara");
        cities.add("Afghanistan");
        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
    }
}
