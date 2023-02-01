package Class16;

public class Student {
    String name;
    String id;
    static String schoolName;
    int age;
    double weight;
    void printName(){
        int SSN=1234567;
        System.out.println(name);
        System.out.println(schoolName);
    }
    static void printstudenInfo(){
     //   System.out.println(name); can't access here
        System.out.println(schoolName);
    }

}
