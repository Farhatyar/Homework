package Class6;

import java.util.Scanner;

public class LogicalorDemo {
    public static void main(String[] args) {
        System.out.println("Please Enter the day");
        Scanner scan=new Scanner(System.in);
        String day=scan.next();
        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("no Class today");
        }else if (day.equalsIgnoreCase("Saturday")|| day.equalsIgnoreCase("sunday")){
            System.out.println("Java class Enjoy");
        } else if (day.equalsIgnoreCase("Wednesday")|| day.equalsIgnoreCase("tuesday")) {
            System.out.println("Manual Teating calss");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Review class");
        }else {
            System.out.println("Worng day entered");
        }
    }
}
