package HomeWork4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {  //done
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the English Quiz Score");
        int Eqs= scan.nextByte();
        System.out.println("Enter the maths Quiz Score");
        int mqs=scan.nextByte();
        System.out.println("Enter the history Quiz Score");
       int hqs=scan.nextByte();


        System.out.println("Enter the English midterm score");
        int Ems= scan.nextByte();
        System.out.println("Enter the maths midterm score");
        int mms= scan.nextByte();
        System.out.println("Enter the history midterm score");
        int hms= scan.nextByte();

        System.out.println("Enter the English final score");
        int Efs= scan.nextByte();
        System.out.println("Enter the maths final score");
        int mfs= scan.nextByte();
        System.out.println("Enter the history final score");
        int hfs= scan.nextByte();

        int English=Eqs+Ems+Efs;
        int maths=mqs+mms+mfs;
        int history=hqs+hms+hfs;

        int average=(English+maths+history)/3;
        System.out.println("Your yearly marks average is : "+average);

        if (average>=90){
            System.out.println("Grade : A");
        }else if (average<90 && average>=70){
            System.out.println("Grade : B");
        }else if (average<70 && average>=50){
            System.out.println("Grade : C");
        }else{
            System.out.println("Grade : F");
        }


    }
}
