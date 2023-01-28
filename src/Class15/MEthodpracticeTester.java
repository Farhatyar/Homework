package Class15;

public class MEthodpracticeTester {
    public static void main(String[] args) {
        MEthodPractice mp=new MEthodPractice();
       boolean isEven= mp.isEven(15);
        System.out.println(isEven);
        // call isEven method for the numbers 100 12 20
        boolean isEven2= mp.isEven(100);
        System.out.println(isEven2);
        System.out.println(mp.isEven(12));
        System.out.println(mp.isEven(20));

    }
}
