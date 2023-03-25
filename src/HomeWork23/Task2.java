package HomeWork23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    /*Create a static method that will return a List of Exceptions.
    Inside your method create objects of 4 exception classes using try and
    catch blocks and store them inside your list. Call your method inside main
     and print name and details of all Exception objects
    */
    public static List<Exception> exceptionsList(){
        List<Exception> exceptions=new ArrayList<>();
        try{
            int [] arr=new int[2];
            System.out.println(arr[2]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
            exceptions.add(e);
        }
        try {
            int numbers=(10/0);
        }catch (ArithmeticException e){
            System.out.println(e);
            exceptions.add(e);
        }
        try {
            String s=null;
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println(e);
            exceptions.add(e);
        }
        try {
            String path="Something";
            FileInputStream fileInputStream=new FileInputStream(path);
        }catch (FileNotFoundException e){
            System.out.println(e);
            exceptions.add(e);
        }
        return exceptions;
    }

    public static void main(String[] args) {
        exceptionsList();
    }

}
