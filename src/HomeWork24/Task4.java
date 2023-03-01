package HomeWork24;

public class Task4 {
    /*Create a method checkUserName that will throw a runtime exception.
     Method should throw an exception when entered username is less than 5 characters.
     */
    public static void checkUserName(String usreName){
        if (usreName.length()<5){
            throw new RuntimeException("Username should be 5 characters or more");
        }
    }

    public static void main(String[] args) {
   try{
          checkUserName("Omar");
      }catch (RuntimeException e) {
          System.out.println(e);
      }
    }
}
