package HomeWork4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please Enter your country");
        String country= scan.next();

        switch (country){
            case "Afghanistan":
                System.out.println("Persian");
                break;

            case "USA":
                System.out.println("English");
                break;

            case "Brazil":
                System.out.println("Portuguese");
                break;

            case "China":
                System.out.println("Chinese");
                break;

            case "canada":
                System.out.println("English and French");
                break;
            default:
                System.out.println("wrong country");

        }
    }
}
