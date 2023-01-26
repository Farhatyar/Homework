package Class10;


import java.util.Arrays;
import java.util.Scanner;

public class ScannnerAndArrays {
    public static void main(String[] args) {

        Scanner Scanner=new Scanner(System.in);
        System.out.println("Please Enter 5 numbers");
        int [] numbers=new int[5];
        // below code manually store numbers in the array
        /*numbers[0]=40;
        numbers[1]=50;
        numbers[3]=60;
        numbers[2]=70;
        numbers[4]=80; */

        //below cold take the numbers from user store them in the array its good but a
        // lot of code
       /* numbers[0]=Scanner.nextInt();
        numbers[1]=Scanner.nextInt();
        numbers[2]=Scanner.nextInt();
        numbers[3]=Scanner.nextInt();
        numbers[4]=Scanner.nextInt();

        */
        // below coe uses a normal for loop to ask the user for numbers and store them
        // in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=Scanner.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
    }
    }
