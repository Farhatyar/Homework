package HomeWork22;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    /*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers */
    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();
        numbers.add(11);
        numbers.add(2554);
        numbers.add(45874);
        numbers.add(20);
        numbers.add(8);
        numbers.add(546);

        int sum=0;

        for(Integer number :numbers){
            sum+=number;
        }
        System.out.println(sum);
    }
}
