package HomeWork4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

               Scanner scen=new Scanner(System.in);
        int number1, number2, result;
        char operator;

        System.out.println("Please Enter your First number");
        number1 =scen.nextInt();
        System.out.println("Please Enter your second number");
        number2 =scen.nextInt();

        System.out.println("Please Enter an operator for calculator");
        operator = scen.next().charAt(0);

        switch (operator){
            case '+':
                result = number1 +number2;
                System.out.println(result);
                break;

            case '-':
                result =number1 -number2;
                System.out.println(result);
                break;

            case '*':
                result = number1 *number2;
                System.out.println(result);
                break;

            case '/':
                result =number1/number2;
                System.out.println(result);
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
