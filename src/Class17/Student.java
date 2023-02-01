package Class17;

public class Student {
    int iD;
    String name;

    int age;
    double weight;
    public  Student(int studentID, String studentName, int studentage) {
        iD = studentID;
        name = studentName;
        age = studentage;

    }

   public Student(int studentID, String studentName, int studentage, double studentweight){
        iD=studentID;
        name=studentName;
        age=studentage;

        }
    void printInfo(){
        System.out.println(" Name "+name+" Id "+iD+" Age "+age+" Weight "+weight);

    }
}
