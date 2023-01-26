package Class12;

import javax.lang.model.util.Elements;

public class StringDemo {
    public static void main(String[] args) {
        // creating an object of the string calss
        String strObj=new String("java");
        // another way of creating an object of String class a shorter way
        // mostly this is how we create the objects of string class
        String strObj2="java";
        System.out.println((strObj2.length()));
        String str="Banana ";
      int len=str.length();
        System.out.println(len);
        String name="Ahmad Tamim Farhatyar";
        if(name.length()>10){
            System.out.println("Name can't be more than 10 letters");
        }

    }
}
