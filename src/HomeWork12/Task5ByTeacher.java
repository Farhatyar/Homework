package HomeWork12;

public class Task5ByTeacher {
    /*Write a method to return whether given number is prime or not?
    return type =>boolean
    name => is prime
    parameter => int unmber
     */
    boolean isPrime(int number) {
        boolean flag = true;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        Task5ByTeacher task5=new Task5ByTeacher();
        System.out.println(task5.isPrime(13));
    }
}
