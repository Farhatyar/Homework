package HomeWork11;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
    /*How would you check if String is palindrome
    or not? aba=> true  Abbc =>false
     */
String word="Omar";
String reverse=new StringBuilder(word).reverse().toString();

if (word.equals(reverse)){
    System.out.println(word+ " is a palindrome");
}else {
    System.out.println(word+ " is not a palindrome");
}

    }
}
