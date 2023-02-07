package HomeWork16.Task2;

public class Employee {
    /*Create an Employee class that will have variables and methods.
    Constructor that should initialize instance variables
    Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    Test your code!
    */
    String empName;
    int empID;
    private short empSalary;

    void weekdays(){
        System.out.println("I'm tired");
    }
    void weekend(){
        System.out.println("still gets up at 6 AM");
    }
    Employee(String empName, int empID,short empSalary){
        this.empName=empName;
        this.empID=empID;
        this.empSalary=empSalary;
    }
    void details(){
        System.out.println("Name: "+empName);
        System.out.println("ID: "+empID);
        System.out.println("Salary: "+empSalary);
    }
}
class PartTimeEmp extends Employee{
    String shift;
    void daysPresent (String[]days){
        for (String day:days){
            System.out.println(day+" ");
        }
        System.out.println();
    }
    PartTimeEmp(String shift,String empName, int empID,short empSalary){
        super(empName,empID,empSalary);
        this.shift=shift;
    }
    void details(){
        super.details();
        System.out.println("Shift: "+shift);
    }

    public void daysPresent(String monday, String tuesday, String friday) {
    }
}
class FulltimeEmp extends Employee{
    String department;
    void vacation(){
        System.out.println("I need vacation time");
    }
    FulltimeEmp(String department, String empName, int empID, short empSalary){
        super(empName,empID,empSalary);
        this.department = department;
    }
    void details(){
        super.details();
        System.out.println("Department: "+department);
    }
}
class HRFullTimeEmps extends FulltimeEmp{
    String responsibility;
    String unpaidLeaves(int x){
        return " If you take "+x+" Days of unPaid leaves ,wages of "+x+" days will be deducted from your payroll";
    }
    HRFullTimeEmps (String responsibility,String jobTitle,String empName, int empID,short empSalary){
        super(jobTitle,empName,empID,empSalary);
        this.responsibility=responsibility;
    }
    void classDetails(){
        System.out.println("responsibility: "+responsibility);
    }
    void details(){
        super.details();
        classDetails();
    }
}