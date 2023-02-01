package Class16;

public class StudentTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="ahmad";
        student.id="123";
        student.age=30;
        student.weight=75;
        student.schoolName="Syntax";


        Student student1=new Student();
        student1.name="omar";
        student1.id="456";
        student1.age=3;
        student1.weight=25;
       // student1.schoolName="Syntax";


        Student student2=new Student();
        student2.name="khan";
        student2.id="789";
        student2.age=25;
        student2.weight=95;
        //student2.schoolName="Syntax";

        System.out.println(student2.schoolName);
        System.out.println(student.schoolName);
        System.out.println(student.name);


    }
}
