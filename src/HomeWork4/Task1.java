package HomeWork4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please Enter your height in inches unit");
        int height = scan.nextInt();

        if (height<60){
            System.out.println("short");
        }else if (height>=60 && height<=72){
            System.out.println("Average");
    } else if (height>72) {
            System.out.println("Tall");

        }


    }
}
