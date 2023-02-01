package Class16;

public class Students {
    /*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */
    String name;
    String Id;
   static int noOfstudents;

    public static void main(String[] args) {
        Students Ahmad=new Students();
        Ahmad.name="Ahmad";
        Ahmad.Id="1";
        Ahmad.noOfstudents++;

        Students jan=new Students();
        jan.name="jan";
        jan.Id="2";
        jan.noOfstudents++;
        System.out.println(Students.noOfstudents);



    }

}
