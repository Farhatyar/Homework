package HomeWork13;

public class Task2byTeacher {
    /*Create a method that will take a String as a parameter and returns
     reversed String. Method should be available to all classes within
      your project and accessible by class name.
     */
    public static String reverseStr(String input){
        return new StringBuilder(input).reverse().toString();
    }


    public static void main(String[] args) {

        System.out.println(reverseStr("monday"));
    }
}
