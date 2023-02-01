package class9;

public class ArraysDemo {
    public static void main(String[] args) {
        String name="Ahmad";
        String name2="khan";
        String name3="jan";
        String name4="omad";
        String name5="Tamim";

        String [] names={"ahmad","khan","jan","omad","Tamim"};
        System.out.println(name3);
        System.out.println(names[2]);
        System.out.println(names[5]);
        // System.out.println(names[500]); error because there is no name on index number 500
        //System.out.println(names[-5]); error because index can't be negative
        // write a loop to print all names from array
        for (int i = 0; i <=6 ; i++) {
            System.out.println(names[i]);

        }
    }
}
