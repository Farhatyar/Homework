package Class15;

import jdk.dynalink.beans.StaticClass;

public class Dog {
String name; // instanca variables.
    String breed; // instanca variables.
    String color; // instanca variables.

    static int noOfLegs=4; //static variable
void printFood(){
    String food="meat"; // local
    System.out.println(food);
}
}
