package HomeWork21;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    /*Create a Set collection that will hold Objects of Student Type.
   In this set we do not care about the insertion order. Each student
   object should have name and studentID. Display name of each student.
    */
    public static void main(String[] args) {

        // HashSet<Student> students=new HashSet<>();
        Set<Student> students = new HashSet<>();// we can achieve polymorphism
        students.add((new Student("Ahmad",123)));
        students.add((new Student("Omar",456)));
        students.add((new Student("Khan",789)));
        students.add((new Student("Yousuf",458)));
        students.add((new Student("Tamim",4513)));

        for (Student student:students){
            System.out.println(student.getName());
        }
    }
}

class Student{
    private  String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    public  String getName(){
        return name;
    }
    public int getStudentId(){
        return studentId;
    }

}
