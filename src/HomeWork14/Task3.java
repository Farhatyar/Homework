package HomeWork14;

public class Task3 {
    /*Write a java class that have 4 constructors with 4 different access levels
     of constructors(private,public,default,protected) and create 4 objects of
      this class: 1 - inside same class; 2 - from outside the class;
       3 - from different class inside different package  and observe result.
     */
    public Task3(String sName){

    }
    private Task3(int sId){

    }
    Task3(char sGender){

    }
    protected Task3(double avgMarks){

    }

    public static void main(String[] args) {
        Task3 obj=new Task3(109);

    }

}
