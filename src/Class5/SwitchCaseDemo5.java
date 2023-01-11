package Class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Gender M f");
        char gender=scanner.next().charAt(0);
        switch (gender){
            case 'f':
                System.out.println("Female");
                break;
            case 'm':
                System.out.println("male");
                break;
            default:
                System.out.println("not specified");
        }

        }
    }
