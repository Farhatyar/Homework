package HomeWork10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       /* Write a program that reads two people's first
names and if they  expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIE

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("What's Dad's First name?");
        String dadsName= scan.next();

        System.out.println("What's Mom's First name?");
        String momsname= scan.next();

        System.out.println("Are you Expecting a boy?");
       boolean boy= scan.nextBoolean();

       if (boy){
           System.out.println("the boy's name should be: "
                   +dadsName.substring(0,dadsName.length()/2)+momsname.substring(momsname.length()/2));
       }else {
           System.out.println("the girl's name should be: "
                   +momsname.substring(0,momsname.length()/2)+dadsName.substring(dadsName.length()/2));
       }
    }
}
