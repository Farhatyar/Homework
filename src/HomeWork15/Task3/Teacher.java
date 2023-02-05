package HomeWork15.Task3;

public class Teacher {
    String name;
    int age;
    void scream(){
        System.out.println("aaaaaaaa");
    }
    String eat(String a){
        if(a.equalsIgnoreCase("Food")){
            return "Yeah, sure";
        }else {
            return " I will fail you";
        }
    }
}
class mathteacher extends Teacher{
    boolean alwayspresent=true;
    void mathprint(){
        System.out.println("do practice");
    }
}
class ChemistryTeacher extends Teacher{
    boolean angry=true;
    void Chemprint(){
        System.out.println("Let's do an experiment");
    }
}
class pianoTeacher extends Teacher{
    String teaches="nothing";
    void pianoprint(){
        System.out.println("pay your fee");
    }
}
