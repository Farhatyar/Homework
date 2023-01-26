package HomeWork10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       /* Create a String and print it in reverse order
       (Sunday → yadnuS).
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a Word");
        String word= scan.next();



        for (int i = word.length()-1; i >= 0; i--) {
            System.out.print(word.charAt(i)+" ");

        }
    }
}
