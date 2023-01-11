package HomeWork4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);     //done
        System.out.println("Please Enter the day number");
        int day = scan.nextInt();
        if(day>=1 && day<=5){
            System.out.println("weekday");
        } else if (day==6 || day==7) {
            System.out.println("weekend");
        }else {
            System.out.println("Invalid day");
        }

    }
}