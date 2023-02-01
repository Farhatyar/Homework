package Class16;

import java.util.Scanner;

public class personTester {
    public static void main(String[] args) {
        person person=new person();
       // System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printSSN();
        person.printTikTokAccount();
       // person.printPassword();
        Scanner scanner=new Scanner(System.in);
        scanner.next();
    }
}


