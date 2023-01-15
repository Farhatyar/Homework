package HomeWork6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*Write a program that reads a range of integers (start and end point),
         provided by a user and then from that range prints the sum of the even and odd integers.
         */
        Scanner scanner=new Scanner(System.in);

        System.out.println("From : ");
        int start=scanner.nextInt();
        System.out.println("To : ");
        int end= scanner.nextInt();

        int sumofEvens=0;
        int sumofOdds=0;

        for (int i = start; i <end ; i++) {
            if(i%2==0){
               sumofEvens=sumofEvens+i;
            } else if (i%2!=0) {
             sumofOdds=sumofOdds+i;
            }

        }
        System.out.println("Sum of Even numbers between "+start+ " and "+end+" is "+sumofEvens);
        System.out.println("Sum of Even numbers between "+start+ " and "+end+" is "+sumofOdds);

    }
}
