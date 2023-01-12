package HomeWork4part2;

public class Task1 {
    public static void main(String[] args) {
     boolean workday=true;
     int day=1;
     while (workday){
         System.out.println("I need a day off");
         if (day==6){
             workday=false;
             System.out.println("I do not need a day off");
         }
         day++;
     }

    }
}
