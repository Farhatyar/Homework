package HomeWork12;

public class Task2 {
    /*Create a method that will take a number
     and prints whether the number is even or odd.
     */
    boolean EvenOrOdd (int number){
        if(number%2==0){
            return true;
        }else {
            return false;
        }
    }
    // Task2 tester
    public static void main(String[] args) {
        Task2 result =new Task2();
        System.out.println(result.EvenOrOdd(21));
    }
}
