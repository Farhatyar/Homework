package HomeWork14;

public class student {
    /*Write a java Class Students that have a constructor which takes students
     name and 3 subject grades. Inside your class also have a method to Calculate
      Average Grade. Test Student class for 5 different students with different marks.
       Your program should print an average mark of each students name.
     */
    //NOTE: please use different names for instance and local variables.
 String name;
 int math;
 int history;
 int biology;
 int average;

 student (String stName, int stMath, int stHistory,int stBiology){
     name=stName;
     math=stMath;
     history=stHistory;
     biology=stBiology;
     average=(math+history+biology)/3;
 }
 void printAverage(){
     System.out.println(average);
 }
}
