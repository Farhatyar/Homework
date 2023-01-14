package Class8;

import java.util.Scanner;

public class LoopwithString {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Name");
        Scanner Scanner=new Scanner(System.in);
        while (Scanner.next().equalsIgnoreCase("sha")){
            System.out.println("Great student who always wanted an example with string in loop");
        }
    }
}
