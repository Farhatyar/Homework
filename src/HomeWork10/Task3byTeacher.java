package HomeWork10;

import Class13.StringRecap;

import java.util.Scanner;

public class Task3byTeacher {
    public static void main(String[] args) {
       /* Write a program that reads two people's first
names and if They are  expecting boy or girl?
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
        String dadsName="Daniel";
        String momsName="Mary";
        String expectation="Boy";
        String firstHalf="";
        String secondHalf="";
        if (expectation.equalsIgnoreCase("boy")){
            firstHalf=dadsName.substring(0,dadsName.length()/2);
             secondHalf=momsName.substring(momsName.length()/2);

        }else {
            firstHalf=momsName.substring(0,momsName.length()/2);
            secondHalf=dadsName.substring(dadsName.length()/2);
        }
        System.out.println(firstHalf+secondHalf);
    }
}
