package HomeWork12;

public class Task6 {
    /*Create  class Student that will have a method getGrade.
     Your method should accept the score of a student and return a grade:
     score > 90 - A
     score >80 - B
     score >70 - C
     score > 50 - D
     anything else - F
     */
    Task6 task6=new Task6();
    char getGrade (int a){
        if (a>=90){
            return ('A');
        }else if (a>=80){
            return ('B');
        }else {
            if(a>=70){
                return ('C');
            }else {
                if (a>=50){
                    return ('D');
                }else {
                    return ('F');
                }
            }
        }
    }
}
