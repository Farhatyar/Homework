package HomeWork13;

public class Task3ByT {
    public static void main(String[] args) {
        System.out.println(getOnlyVowels("Java"));
    }
    /*Create a method that will accept a String as a parameter and return a new
     String that consist only of vowels. Method should be available inside the
      class only where it was declared and executed by calling it is name  */
    //return type =>String
    // name => getOnlyVowels
    //parameters=> String inputStr

private static String getOnlyVowels(String inputStr){
 //AEIOUY aeiouy
 //Asghar => Aa
 return inputStr.replaceAll("[AEIOUYaeiouy]","");
}
}