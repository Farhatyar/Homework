package HomeWork23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    /*How would handle InputMismatchException? Input Mismatch Exception
    when user enters mismatch value then programmer expected
    */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your age");
        try{
            int num=scan.nextInt();
            System.out.println(num);
        }catch (InputMismatchException e){
            System.out.println("please enter numbers");
        }

    }
}


