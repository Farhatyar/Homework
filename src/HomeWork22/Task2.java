package HomeWork22;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
  /*  Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
 In that map store personId and a Person Object. Print each object details.
*/
}
class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;

    }
    public void printUserDetails(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);

    }
}

class Tester{
    public static void main(String[] args) {
        Map<Integer,Person> people=new TreeMap<>();
        people.put(4,new Person("Omar","Farhatyr",20,15000));
        people.put(1,new Person("Omid","Salaah",23,35000));
        people.put(6,new Person("Ahmad","Khan",40,25000));

       // Set<Map.Entry<Integer,Person>> entries=people.entrySet();
        var entries=people.entrySet();

        for(var person: entries){
            System.out.print(person.getKey()+" ");
           person.getValue().printUserDetails();

        }
    }
}