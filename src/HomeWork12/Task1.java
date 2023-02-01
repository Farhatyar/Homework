package HomeWork12;

public class Task1 {
    /*Create a method that will take 2 parameters as
     a numbers and prints which number is larger
     */
    int LargerNumber(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }
    // Task1 Teaster
    public static void main(String[] args) {
        Task1 result=new Task1();
        System.out.println(result.LargerNumber(12,45));
    }
}


