package HomeWork3;

public class Task1 {
    public static void main(String[] args) {

        boolean diploma=true;
        double gpa=3.7;
        if(diploma){
            System.out.println("congratuation");
            if (gpa>=3.5){
                System.out.println("You are eligible for scholarship");
            }else {
                System.out.println("you should have studied harder");
            }
        }else {
            System.out.println("get a degree");
        }

    }
}
