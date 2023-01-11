package Class4;

public class IfElaseIfConditionDemo3 {
    public static void main(String[] args) {

        int day =365; // Assign a value to a variable

        if (day == 1) { // we compare two values
            System.out.println("Monday"); // if block
        } else if (day == 2) {
            System.out.println("tuesday");  // else block
        } else if (day == 3) {
            System.out.println("wednesday");
        } else if (day == 4) {
            System.out.println("thursday");

        } else if (day == 5) {
            System.out.println("friday");

        } else if (day == 6) {
            System.out.println("saturday");
        } else if (day == 7) {
            System.out.println("sunday");
        } else {
            System.out.println("wrong day number");
        }
    }
}
