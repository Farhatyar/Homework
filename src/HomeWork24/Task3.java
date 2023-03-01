package HomeWork24;

public class Task3 {
    /*Create a method to check age eligibility that will throw a runtime exception.
    Method should throw an exception age is less than 16
     */
    public static void checkAge(int age){
        if (age<16){
            throw new RuntimeException("age should be +16");
        }
    }

    public static void main(String[] args) {
       try{
           checkAge(14);
       }catch (RuntimeException e){
           System.out.println(e);

       }
    }
}
